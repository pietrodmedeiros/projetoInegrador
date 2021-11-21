package universidade;

import javax.xml.crypto.Data;
import java.util.Date;
public class Professor extends PessoaFisica{
    private Integer id_professor;
    private String cargo;
    private Curso nome_curso;
    private String materia;

    //getters e setters


    public Integer getId_professor() {
        return id_professor;
    }

    public void setId_professor(Integer id_professor) {
        this.id_professor = id_professor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Curso getNome_curso() {
        return nome_curso;
    }

    public void setNome_curso(Curso nome_curso) {
        this.nome_curso = nome_curso;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Professor(String nome, Integer cpf, String email, Integer matricula, Integer id_professor, String cargo) {
        super(nome, cpf, email, matricula);
        this.id_professor = id_professor;
        this.cargo = cargo;
    }
}
