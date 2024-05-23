package med.vol.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity {

    private String logradouro;
    private String bairro;
    private String cep;
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

    public void atualizarEndereco(EnderecoDTO endereco) {

        if(StringUtils.isNotBlank(endereco.getLogradouro())){
            this.logradouro = endereco.getLogradouro();
        }
        if(StringUtils.isNotBlank(endereco.getBairro())){
            this.bairro = endereco.getBairro();
        }
        if(StringUtils.isNotBlank(endereco.getCep())){
            this.cep = endereco.getCep();
        }
        if(endereco.getNumero() != null){
            this.numero = endereco.getNumero();
        }
        if(StringUtils.isNotBlank(endereco.getComplemento())){
            this.complemento = endereco.getComplemento();
        }
        if(StringUtils.isNotBlank(endereco.getCidade())){
            this.cidade = endereco.getCidade();
        }
        if(StringUtils.isNotBlank(endereco.getUf())){
            this.uf = endereco.getUf();
        }
    }
}
