package universidade;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        var endereco1 = new Endereco(801010, "Rua 1", 1, "casa 4", "Centro", "Sao Paulo", "SP", 01);
        var curso1 = new Curso("ADS", 012);
        
        var endereco2 = new Endereco(801011, "Rua Laura Miller", 1, "casa 3", "Copacabana", "Rio de Janeiro", "RJ", 02);

  
        
        var aluno1 = new Aluno("João da Silva",
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

        var aluno2 = new Aluno("Mariana da Silva",
                endereco2,
                025544,
                4887500,
                new Date(),
                "feminino",
                33666655,
                "mariana@silva.com",
                158471,
                02,
                "Ativo",
                curso1);
        
        System.out.println(aluno1.getGenero());
        System.out.println(aluno2.getNome());
    }
}


//String nome, Endereco endereco_id, Integer cpf, Integer rg, Data data_nasc, String genero, Integer telefone,
// String email, Integer matricula, Integer id_aluno, String situacao, Curso id_curso