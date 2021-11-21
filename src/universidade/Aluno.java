package universidade;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Aluno extends PessoaFisica implements Serializable {
    private Integer id_aluno;
    private String situacao;
    private Curso id_curso;

    // getters e setters

    public Integer getId_aluno() {
        return id_aluno;
    }

    public void setId_aluno(Integer id_aluno) {
        this.id_aluno = id_aluno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Curso getId_curso() {
        return id_curso;
    }

    public void setId_curso(Curso id_curso) {
        this.id_curso = id_curso;
    }


    // método construtor


    public Aluno(String nome, Integer cpf, String email, Integer matricula, Integer id_aluno, String situacao) {
        super(nome, cpf, email, matricula);
        this.id_aluno = id_aluno;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + "; CPF: " + getCpf() + "; email: " + getEmail() + ";  Código: " + id_aluno + ";  Situação: " + situacao);
    }
}
