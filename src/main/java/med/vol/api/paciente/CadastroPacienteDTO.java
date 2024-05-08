package med.vol.api.paciente;

import lombok.Data;
import lombok.NonNull;
import med.vol.api.endereco.EnderecoDTO;

@Data
public class CadastroPacienteDTO {

    private String nome;
    private String email;
    private Long cpf;
    private Long telefone;
    private EnderecoDTO endereco;

}
