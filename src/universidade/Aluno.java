package universidade;

import java.io.*;

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
    public Aluno(String nome, String cpf, String email, Integer id_aluno, String situacao) {
        super(nome, cpf, email);
        this.id_aluno = id_aluno;
        this.situacao = situacao;
    }

    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + "; CPF: " + getCpf() + "; email: " + getEmail() + ";  Código: " + id_aluno + ";  Situação: " + situacao);
    }

    static File fileAluno = new File("alunos.txt");

    // método que salva os alunos no txt utilizando Serialize e Descerialize
    public static void cadastrarAlunos(Aluno aluno1, Aluno aluno2, Aluno aluno3, Aluno aluno4, Aluno aluno5, Aluno aluno6) throws IOException {

        FileOutputStream fileOutput = new FileOutputStream(fileAluno);

        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        objectOutput.writeObject(aluno1);
        objectOutput.writeObject(aluno2);
        objectOutput.writeObject(aluno3);
        objectOutput.writeObject(aluno4);
        objectOutput.writeObject(aluno5);
        objectOutput.writeObject(aluno6);

        objectOutput.close();
        fileOutput.close();
        System.out.println("Alunos cadastrados com sucesso no arquivo: " + fileAluno);
    }

    // método que le o conteúdo do txt e coloca em um array na memória para listar no terminal
    public static void listarAlunos() throws IOException{
        Aluno[] alunos = new Aluno[6];

        FileInputStream fileInput = new FileInputStream(fileAluno);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);

        try {
            alunos[0] = (Aluno) objectInput.readObject();
            alunos[1] = (Aluno) objectInput.readObject();
            alunos[2] = (Aluno) objectInput.readObject();
            alunos[3] = (Aluno) objectInput.readObject();
            alunos[4] = (Aluno) objectInput.readObject();
            alunos[5] = (Aluno) objectInput.readObject();

            objectInput.close();
            fileInput.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("=====================LISTA DE ALUNOS CADASTRADOS================== ");
        for(int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
        System.out.println("================================================================== \n\n");
    }
}
