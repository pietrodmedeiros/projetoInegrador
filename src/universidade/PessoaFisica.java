package universidade;

import java.io.Serializable;
import java.util.Date;

public class PessoaFisica extends Pessoa implements Serializable {
    private Integer cpf;
    private Integer rg;
    private Date data_nasc;
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

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
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

    public PessoaFisica(String nome, Integer cpf, String email, Integer matricula) {
        super(nome);
        this.cpf = cpf;
        this.email = email;
        this.matricula = matricula;
    }
}
