package med.vol.api.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class EnderecoDTO {

    @NotBlank
    private String logradouro;

    @NotBlank
    private String bairro;

    @Pattern(regexp = "\\d{8}")
    private String cep;

    @NotBlank
    private String cidade;

    @NotBlank
    private String uf;

    private Integer numero;

    private String complemento;
}
