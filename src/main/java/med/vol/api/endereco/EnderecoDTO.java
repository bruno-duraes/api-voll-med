package med.vol.api.endereco;

import lombok.Data;

@Data
public class EnderecoDTO {

    private String logradouro;
    private String bairro;
    private Integer cep;
    private String cidade;
    private String uf;
    private Integer numero;
    private String complemento;
}
