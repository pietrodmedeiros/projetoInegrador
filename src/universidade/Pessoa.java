package universidade;

public class Pessoa {
    private String nome;
    private Integer endereco_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Integer endereco_id) {
        this.endereco_id = endereco_id;
    }

    public Pessoa(String nome, Integer endereco_id) {
        this.nome = nome;
        this.endereco_id = endereco_id;
    }
}
