package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.medico.CadastroMedicoDTO;
import med.vol.api.medico.MedicoEntity;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
