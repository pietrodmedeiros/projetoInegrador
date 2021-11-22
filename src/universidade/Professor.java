package universidade;

import java.io.*;

public class Professor extends PessoaFisica implements Serializable{
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

    public Professor(String nome, String cpf, String email, Integer id_professor, String cargo) {
        super(nome, cpf, email);
        this.id_professor = id_professor;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + "; CPF: " + getCpf() + "; email: " + getEmail() + ";  Código: " + id_professor + ";  Cargo: " + cargo);
    }

    static File fileProfessor = new File("professores.txt");

    // método que salva os professores no txt utilizando Serialize e Descerialize
    public static void cadastrarProfessor(Professor professor1, Professor professor2, Professor professor3) throws IOException {

        FileOutputStream fileOutput = new FileOutputStream(fileProfessor);

        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        objectOutput.writeObject(professor1);
        objectOutput.writeObject(professor2);
        objectOutput.writeObject(professor3);

        objectOutput.close();
        fileOutput.close();
        System.out.println("Professores cadastrados com sucesso no arquivo: " + fileProfessor);
    }

    // método que le o conteúdo do txt e coloca em um array na memória para listar no terminal
    public static void listarProfessores() throws IOException{
        Professor[] professores = new Professor[3];

        FileInputStream fileInput = new FileInputStream(fileProfessor);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);

        try {
            professores[0] = (Professor) objectInput.readObject();
            professores[1] = (Professor) objectInput.readObject();
            professores[2] = (Professor) objectInput.readObject();

            objectInput.close();
            fileInput.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("=====================LISTA DE PROFESSORES CADASTRADOS================== ");
        for(int i = 0; i < professores.length; i++) {
            System.out.println(professores[i]);
        }
        System.out.println("======================================================================= \n\n");
    }
}
