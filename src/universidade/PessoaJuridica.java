package universidade;

public class PessoaJuridica extends Pessoa{
    private Integer cnpj;
    private  String razao_social;
    private String nome_fantasia;

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public PessoaJuridica(String nome, Integer endereco_id, Integer cnpj, String razao_social, String nome_fantasia) {
        super(nome, endereco_id);
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
    }
}
