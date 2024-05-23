package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    MedicoRepository medicoRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid CadastroMedicoDTO cadastroMedicoDTO){
        medicoRepository.save(new MedicoEntity(cadastroMedicoDTO));
    }

    @GetMapping
    public Page<MedicoDTO> listar(@PageableDefault(sort = "nome", size = 10) Pageable paginacao){
        return medicoRepository.findAll(paginacao).map(MedicoDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@Valid @RequestBody AtualizarMedicoDTO atualizarMedicoDTO){

        var medico = medicoRepository.getReferenceById(atualizarMedicoDTO.getId());
        medico.atualizarMedico(atualizarMedicoDTO);
    }
}
