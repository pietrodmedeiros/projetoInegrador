package universidade;

import java.io.*;

public class Fornecedor extends PessoaJuridica implements Serializable{
    private  Integer codigo;
    private String area_atuacao;

    //getters e setters

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getArea_atuacao() {
        return area_atuacao;
    }

    public void setArea_atuacao(String area_atuacao) {
        this.area_atuacao = area_atuacao;
    }

    //método construtor


    public Fornecedor(String nome, String cnpj, String razao_social, String nome_fantasia, Integer codigo, String area_atuacao) {
        super(nome, cnpj, razao_social, nome_fantasia);
        this.codigo = codigo;
        this.area_atuacao = area_atuacao;
    }

    @Override
    public String toString() {
        return ("Nome: " + super.getNome() + "; CNPJ: " + getCnpj() + "; Razão Social: " + getRazao_social() + ";  Nome Fantasia: " + getNome_fantasia() + ";  Código: " + getCodigo() + "; Aáre de atuação: " + getArea_atuacao());
    }

    static File fileFornecedor = new File("fornecedores.txt");

    // método que salva os fornecedores no txt  utilizando Serialize e Descerialize
    public static void cadastrarFornecedor(Fornecedor fornecedor1, Fornecedor fornecedor2, Fornecedor fornecedor3, Fornecedor fornecedor4) throws IOException {

        FileOutputStream fileOutput = new FileOutputStream(fileFornecedor);

        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        objectOutput.writeObject(fornecedor1);
        objectOutput.writeObject(fornecedor2);
        objectOutput.writeObject(fornecedor3);
        objectOutput.writeObject(fornecedor4);

        objectOutput.close();
        fileOutput.close();
        System.out.println("Fornecedores cadastrados com sucesso no arquivo: " + fileFornecedor);
    }

    // método que le o conteúdo do txt e coloca em um array na memória para listar no terminal
    public static void listarFornecedores() throws IOException{
        Fornecedor[] fornecedores = new Fornecedor[4];

        FileInputStream fileInput = new FileInputStream(fileFornecedor);
        ObjectInputStream objectInput = new ObjectInputStream(fileInput);

        try {
            fornecedores[0] = (Fornecedor) objectInput.readObject();
            fornecedores[1] = (Fornecedor) objectInput.readObject();
            fornecedores[2] = (Fornecedor) objectInput.readObject();
            fornecedores[3] = (Fornecedor) objectInput.readObject();

            objectInput.close();
            fileInput.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("=====================LISTA DE FORNECEDORES CADASTRADOS================== ");
        for(int i = 0; i < fornecedores.length; i++) {
            System.out.println(fornecedores[i]);
        }
        System.out.println("======================================================================== \n\n");
    }
}
