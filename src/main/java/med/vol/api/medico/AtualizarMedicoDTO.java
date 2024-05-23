package med.vol.api.medico;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import med.vol.api.endereco.EnderecoDTO;

@Data
public class AtualizarMedicoDTO {

    @NotNull
    private Long id;

    private String nome;

    private String email;

    private EnderecoDTO endereco;
}
