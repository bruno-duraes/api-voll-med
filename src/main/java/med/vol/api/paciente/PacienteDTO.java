package med.vol.api.paciente;

import lombok.Data;

@Data
public class PacienteDTO {

    private String nome;

    private String email;

    private String cpf;

    public PacienteDTO(PacienteEntity pacienteEntity){
        this.nome = pacienteEntity.getNome();
        this.email = pacienteEntity.getEmail();
        this.cpf = pacienteEntity.getCpf();
    }
}
