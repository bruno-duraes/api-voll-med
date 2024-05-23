package med.vol.api.medico;

import lombok.Data;

@Data
public class MedicoDTO {

    private Long id;

    private String nome;

    private String email;

    private String crm;

    private EEspecialidade especialidade;

    public MedicoDTO(MedicoEntity medicoEntity){
        this.id = medicoEntity.getId();
        this.nome = medicoEntity.getNome();
        this.email = medicoEntity.getEmail();
        this.crm = medicoEntity.getCrm();
        this.especialidade = medicoEntity.getEspecialidade();
    }
}
