package med.vol.api.medico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import med.vol.api.endereco.EnderecoEntity;

@Table(name = "medico")
@Entity(name = "MedicoEntity")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class MedicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private EEspecialidade especialidade;

    @Embedded
    private EnderecoEntity endereco;

    public MedicoEntity(CadastroMedicoDTO cadastroMedicoDTO) {
        this.nome = cadastroMedicoDTO.getNome();
        this.email = cadastroMedicoDTO.getEmail();
        this.crm = cadastroMedicoDTO.getCrm();
        this.telefone = cadastroMedicoDTO.getTelefone();
        this.especialidade = cadastroMedicoDTO.getEspecialidade();
        this.endereco = new EnderecoEntity(cadastroMedicoDTO.getEndereco());
    }
}
