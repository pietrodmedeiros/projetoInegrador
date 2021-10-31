package universidade;

import javax.xml.crypto.Data;

public class Professor extends PessoaFisica{
    private Integer id_professor;
    private String cargo;
    private String cursos;
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

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    //método construtor

    public Professor(String nome, Integer endereco_id, Integer cpf, Integer rg, Data data_nasc, String genero, Integer telefone, String email, Integer matricula, Integer id_professor, String cargo, String cursos, String materia) {
        super(nome, endereco_id, cpf, rg, data_nasc, genero, telefone, email, matricula);
        this.id_professor = id_professor;
        this.cargo = cargo;
        this.cursos = cursos;
        this.materia = materia;
    }
}
