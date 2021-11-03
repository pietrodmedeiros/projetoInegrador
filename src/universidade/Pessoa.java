package universidade;

public class Pessoa {
    private String nome;
    private Endereco endereco_id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco_id() {
        return endereco_id;
    }

    public void setEndereco_id(Endereco endereco_id) {
        this.endereco_id = endereco_id;
    }

    public Pessoa(String nome, Endereco endereco_id) {
        this.nome = nome;
        this.endereco_id = endereco_id;
    }
}
