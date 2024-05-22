package med.vol.api.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import med.vol.api.endereco.EnderecoEntity;

@Table(name = "paciente")
@Entity(name = "PacienteEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PacienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String email;

    private String telefone;

    private String cpf;

    @Embedded
    private EnderecoEntity endereco;

    public  PacienteEntity(CadastroPacienteDTO cadastroPacienteDTO){
        this.nome = cadastroPacienteDTO.getNome();
        this.email = cadastroPacienteDTO.getEmail();
        this.telefone = cadastroPacienteDTO.getTelefone();
        this.cpf = cadastroPacienteDTO.getCpf();
        this.endereco = new EnderecoEntity(cadastroPacienteDTO.getEndereco());
    }

}
