package universidade;

import javax.xml.crypto.Data;

public class PessoaFisica extends Pessoa{
    private Integer cpf;
    private  Integer rg;
    private Data data_nasc;
    private String genero;
    private Integer telefone;
    private String email;
    private Integer matricula;

    //getters e setters
    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public Data getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Data data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    //método construtor
    public PessoaFisica(String nome, Integer endereco_id, Integer cpf, Integer rg, Data data_nasc, String genero, Integer telefone, String email, Integer matricula) {
        super(nome, endereco_id);
        this.cpf = cpf;
        this.rg = rg;
        this.data_nasc = data_nasc;
        this.genero = genero;
        this.telefone = telefone;
        this.email = email;
        this.matricula = matricula;
    }
}
