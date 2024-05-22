package med.vol.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import med.vol.api.endereco.EnderecoDTO;

@Data
public class CadastroPacienteDTO {

    @NotBlank
    private String nome;

    @Email
    @NotBlank
    private String email;

    @Pattern(regexp = "\\d{11}", message = "CPF deve conter exatamente 11 dígitos")
    private String cpf;

    @NotBlank
    private String telefone;

    @NotNull @Valid
    private EnderecoDTO endereco;

}
