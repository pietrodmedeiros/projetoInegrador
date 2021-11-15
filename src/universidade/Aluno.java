package universidade;

import java.util.Date;

public class Aluno extends PessoaFisica{
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


    public Aluno(String nome, Endereco endereco_id, Integer cpf, Integer rg, Date data_nasc, String genero, Integer telefone, String email, Integer matricula, Integer id_aluno, String situacao, Curso id_curso) {
        super(nome, endereco_id, cpf, rg, data_nasc, genero, telefone, email, matricula);
        this.id_aluno = id_aluno;
        this.situacao = situacao;
        this.id_curso = id_curso;
    }

    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + "  Código: " + id_aluno + "  Situação: " + situacao);
    }

}
