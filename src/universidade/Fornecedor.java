package universidade;

public class Fornecedor extends PessoaJuridica{
    private  Integer codigo;
    private String area_atuacao;

    //getters e setters

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    //método construtor


    public Fornecedor(String nome, Integer cnpj, String razao_social, String nome_fantasia, Integer codigo, String area_atuacao) {
        super(nome, cnpj, razao_social, nome_fantasia);
        this.codigo = codigo;
        this.area_atuacao = area_atuacao;
    }
}
