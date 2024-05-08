package med.vol.api.medico;

import lombok.Data;
import med.vol.api.endereco.EnderecoDTO;

@Data
public class CadastroMedicoDTO {

    private String nome;
    private String email;
    private String crm;
    private EEspecialidade especialidade;
    private EnderecoDTO endereco;

}
