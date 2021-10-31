package universidade;

import javax.xml.crypto.Data;

public class Aluno extends PessoaFisica{
    private Integer id_aluno;
    private String situacao;
    private Integer id_curso;

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

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }


    // método construtor
    public Aluno(String nome, Integer endereco_id, Integer cpf, Integer rg, Data data_nasc, String genero, Integer telefone, String email, Integer matricula, Integer id_aluno, String situacao, Integer id_curso) {
        super(nome, endereco_id, cpf, rg, data_nasc, genero, telefone, email, matricula);
        this.id_aluno = id_aluno;
        this.situacao = situacao;
        this.id_curso = id_curso;
    }
}
