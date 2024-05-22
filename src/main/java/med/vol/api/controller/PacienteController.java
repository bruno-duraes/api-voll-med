package med.vol.api.controller;

import jakarta.validation.Valid;
import med.vol.api.paciente.CadastroPacienteDTO;
import med.vol.api.paciente.PacienteEntity;
import med.vol.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    PacienteRepository repository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid CadastroPacienteDTO cadastroPacienteDTO){
        repository.save(new PacienteEntity(cadastroPacienteDTO));
    }
}
