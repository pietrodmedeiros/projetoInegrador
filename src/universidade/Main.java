package universidade;

import java.io.*;
import java.util.Date;

public class Main implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        //criando objetos alunos da classe Alunos
        Aluno aluno1 = new Aluno("Marcelo da Silva Sauro", "0007544865", "marcelodasilva@sauro.com", 1010,  "Ativo");
        Aluno aluno2 = new Aluno("Michele da Silva Sauro", "02020202020", "micheledasilva@sauro.com", 1111,  "Ativo");
        Aluno aluno3 = new Aluno("Juliana da Silva Sauro", "03030303030", "julianadasilva@sauro.com", 1212,  "Ativo");
        Aluno aluno4 = new Aluno("Joe da Silva Sauro", "04040404040", "joedasilva@sauro.com", 1313,  "Ativo");
        Aluno aluno5 = new Aluno("Julia da Silva Sauro", "05050505050", "juliadasilva@sauro.com", 1414,  "Ativo");
        Aluno aluno6 = new Aluno("Pietro da Silva Sauro", "06060606060", "pietrodasilva@sauro.com", 1515,  "Ativo");

        //Aluno.cadastrarAlunos(aluno1, aluno2, aluno3, aluno4, aluno5, aluno6);
        Aluno.listarAlunos();

        //criando objetos professores da classe Professor
        Professor professor1 = new Professor("Pedro Rodrigues", "65878955410", "pedro@professores.com", 1101, "Professor Titular");
        Professor professor2 = new Professor("Antonio da Silva", "03654850021", "antonio@professores.com", 1102, "Professor Titular");
        Professor professor3 = new Professor("José Lucas", "55858422225", "jose@professores.com", 1103, "Professor Substituto");

        //Professor.cadastrarProfessor(professor1, professor2, professor3);
        Professor.listarProfessores();

        //criando objetos fornecedores da classe Fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Eletricidade Facil", "08210510000180", "eletrica facil ltda", "Eletrica Facil", 584, "Eletrica");
        Fornecedor fornecedor2 = new Fornecedor("Pisturas Geral", "058455522000187", "Super Pinturas ltda", "Pinturas em Geral", 214, "Pintura");
        Fornecedor fornecedor3 = new Fornecedor("Escritório de Arquitetura", "15452685000198", "Hyper Arq ltda", "Hiper Arquitetura", 321, "Arquitetura");
        Fornecedor fornecedor4 = new Fornecedor("Serviços Consertos Gerais", "58474651000121", "serviços em geral ltda", "Mega Serviços", 154, "Serviços Gerais");

        //Fornecedor.cadastrarFornecedor(fornecedor1, fornecedor2, fornecedor3, fornecedor4);
        Fornecedor.listarFornecedores();
    }
}

