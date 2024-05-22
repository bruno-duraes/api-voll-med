package med.vol.api.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import med.vol.api.endereco.EnderecoDTO;

@Data
public class CadastroMedicoDTO {

    @NotBlank
    private String nome;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String telefone;

    @Pattern(regexp = "\\d{4,6}")
    private String crm;

    @NotNull
    private EEspecialidade especialidade;

    @NotNull @Valid
    private EnderecoDTO endereco;

}
