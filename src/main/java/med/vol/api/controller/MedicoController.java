package med.vol.api.controller;

import med.vol.api.medico.CadastroMedicoDTO;
import med.vol.api.medico.MedicoEntity;
import med.vol.api.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void cadastrar(@RequestBody CadastroMedicoDTO cadastroMedicoDTO){
        medicoRepository.save(new MedicoEntity(cadastroMedicoDTO));
    }
}
