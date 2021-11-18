package universidade;

import java.util.Date;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  throws IOException {

        var endereco1 = new Endereco(801010, "Rua 1", 1, "casa 4", "Centro", "Sao Paulo", "SP", 01);
        var curso1 = new Curso("ADS", 012);

        var endereco2 = new Endereco(801011, "Rua Laura Miller", 1, "casa 3", "Copacabana", "Rio de Janeiro", "RJ", 02);

        //criando array alunos e criando os objetos aluno1,2,3...
        ArrayList<Aluno> alunos = new ArrayList();
        Aluno aluno1 = new Aluno("João da Silva",
                endereco1,
                025555,
                4887585,
                new Date(),
                "masculino",
                33666665,
                "joaosilva@silva.com",
                158477,
                01,
                "Ativo",
                curso1);

        Aluno aluno2 = new Aluno("Mariana da Silva",
                endereco2,
                025547,
                4887545,
                new Date(),
                "feminino",
                33666655,
                "mariana@silva.com",
                158471,
                02,
                "Ativo",
                curso1);
        
        Aluno aluno3 = new Aluno("Maria de Almeida",
                endereco2,
                025544,
                48875741,
                new Date(),
                "feminino",
                33666647,
                "maria@almeida.com",
                158448,
                03,
                "Ativo",
                curso1);

        Aluno aluno4 = new Aluno("Pedro da Silva Sauro",
                endereco2,
                00000000000,
                0000000000,
                null,
                "masculino",
                999999999,
                "pedro@pedro.com.br",
                584842,
                0001,
                "ativo",
                curso1);

        Aluno aluno5 = new Aluno("Mariana da Silva Sauro ",
                endereco2,
                025547,
                4887545,
                new Date(),
                "feminino",
                33666655,
                "mariana@silva.com",
                158471,
                02,
                "Ativo",
                curso1);

        Aluno aluno6 = new Aluno("Maria da Silva Sauro",
                endereco2,
                025544,
                48875741,
                new Date(),
                "feminino",
                33666647,
                "maria@almeida.com",
                158448,
                03,
                "Ativo",
                curso1);

        //imprimindo alunos no terminal
        //baseado no método toString sobrescrito da classe Aluno
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);
        alunos.add(aluno6);
        alunos.forEach(System.out::println);

        System.out.println("Numero de alunos: " + alunos.size());

        //criando arquivo alunos.txt
        BufferedWriter br = new BufferedWriter(new FileWriter("alunos.txt"));

        //adicionando nome dos alunos no txt
        br.write("Nome: " + aluno1.getNome());
        br.newLine();
        br.write("Nome: " + aluno2.getNome());
        br.newLine();
        br.write("Nome: " + aluno3.getNome());
        br.newLine();
        br.write("Nome: " + aluno4.getNome());
        br.newLine();
        br.write("Nome: " + aluno5.getNome());
        br.newLine();
        br.write("Nome: " + aluno6.getNome());
        br.close();

    }
}

