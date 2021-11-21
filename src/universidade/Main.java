package universidade;

import java.io.*;
import java.util.Date;

public class Main implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        // Create some animals from our Serializable class:

        Aluno aluno1 = new Aluno("Marcelo da Silva Sauro", 01010101, "marcelodasilva@sauro.com", 1010, 01, "Ativo");
        Aluno aluno2 = new Aluno("Michele da Silva Sauro", 02020202, "micheledasilva@sauro.com", 1111, 02, "Ativo");
        Aluno aluno3 = new Aluno("Juliana da Silva Sauro", 03030303, "julianadasilva@sauro.com", 1212, 03, "Ativo");
        Aluno aluno4 = new Aluno("Joe da Silva Sauro", 04040404, "joedasilva@sauro.com", 1313, 04, "Ativo");
        Aluno aluno5 = new Aluno("Julia da Silva Sauro", 05050505, "juliadasilva@sauro.com", 1414, 05, "Ativo");
        Aluno aluno6 = new Aluno("Pietro da Silva Sauro", 06060606, "pietrodasilva@sauro.com", 1515, 06, "Ativo");


        File fileProfessor = new File("professores.txt");
        File fileFornecedores = new File("fornecedores.txt");

        //Aluno.cadastrarAlunos(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
        Aluno.listarAlunos();
    }
}
