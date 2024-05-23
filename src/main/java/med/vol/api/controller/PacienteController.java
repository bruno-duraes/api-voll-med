package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.paciente.CadastroPacienteDTO;
import med.vol.api.paciente.PacienteDTO;
import med.vol.api.paciente.PacienteEntity;
import med.vol.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    PacienteRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid CadastroPacienteDTO cadastroPacienteDTO){
        repository.save(new PacienteEntity(cadastroPacienteDTO));
    }

    @GetMapping
    public Page<PacienteDTO> listar(@PageableDefault(sort = "nome", size = 10) Pageable paginacao){
        return repository.findAll(paginacao).map(PacienteDTO::new);
    }
}
