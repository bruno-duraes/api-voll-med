package med.vol.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    private String logradouro;
    private String bairro;
    private Long cep;
    private Integer numero;
    private String complemento;
    private String cidade;
    private String uf;

    public EnderecoEntity(EnderecoDTO endereco) {
        this.logradouro = endereco.getLogradouro();
        this.bairro = endereco.getBairro();
        this.cep = endereco.getCep();
        this.numero = endereco.getNumero();
        this.complemento = endereco.getComplemento();
        this.cidade = endereco.getCidade();
        this.uf = endereco.getUf();
    }
}
