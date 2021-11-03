package universidade;

public class Main {
    public static void main(String[] args) {
        var endereco1 = new Endereco(801010, "rua 1", 1, 0, "centro", "sao paulo", "sp", 01);
        var aluno1 = new Aluno("João da Silva",
               1,
                025555,
                4887585,
                0,
                "masculino",
                33666665,
                "joaosilva@silva.com",
                158477,
                01,
                "Ativo",
                012);

        var aluno2 = new Aluno("Mariana da Silva",
                15857,
                025544,
                4887500,
                0,
                "masculino",
                33666655,
                "mariana@silva.com",
                158477,
                02,
                "Ativo",
                012);
        System.out.println(aluno1, aluno2);
    }
}


//String nome, Endereco endereco_id, Integer cpf, Integer rg, Data data_nasc, String genero, Integer telefone,
// String email, Integer matricula, Integer id_aluno, String situacao, Curso id_curso