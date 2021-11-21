package universidade;

import java.io.*;
import java.util.Date;

public class Main implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        // Create some animals from our Serializable class:

        Aluno aluno1 = new Aluno("Marcelo da Silva Sauro", 01010101, "marcelodasilva@sauro.com", 1010, 0101, "Ativo");
        Aluno aluno2 = new Aluno("Michele da Silva Sauro", 02020202, "micheledasilva@sauro.com", 1111, 0102, "Ativo");
        Aluno aluno3 = new Aluno("Juliana da Silva Sauro", 03030303, "julianadasilva@sauro.com", 1212, 0103, "Ativo");
        Aluno aluno4 = new Aluno("Joe da Silva Sauro", 04040404, "joedasilva@sauro.com", 1313, 0104,"Ativo");
        Aluno aluno5 = new Aluno("Julia da Silva Sauro", 05050505, "juliadasilva@sauro.com", 1414, 0105, "Ativo");
        Aluno aluno6 = new Aluno("Pietro da Silva Sauro", 06060606, "pietrodasilva@sauro.com", 1515, 0106, "Ativo");

        // Specify the name of our file:

        File file = new File("alunos.txt");

        // Create a FileOutputStream for writing to the file.

        FileOutputStream fileOutput = new FileOutputStream(file);

        // Create object output stream to write the serialized objects

        // to the file stream:

        ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);

        // Write our objects to the stream:

        objectOutput.writeObject(aluno1);
        objectOutput.writeObject(aluno2);
        objectOutput.writeObject(aluno3);
        objectOutput.writeObject(aluno4);
        objectOutput.writeObject(aluno5);
        objectOutput.writeObject(aluno6);



        // Close the streams:

        objectOutput.close();

        fileOutput.close();

        /////////////////////////////////////////

        // Reading the objects back into RAM:

        /////////////////////////////////////////

        // Declare an array to hold the animals we read:

        Aluno[] alunos = new Aluno[6];

        // Create a file and an object input stream:

        FileInputStream fileInput = new FileInputStream(file);

        ObjectInputStream objectInput = new ObjectInputStream(fileInput);



        // Read the objects from the file:

        try {

            alunos[0] = (Aluno) objectInput.readObject();
            alunos[1] = (Aluno) objectInput.readObject();
            alunos[2] = (Aluno) objectInput.readObject();
            alunos[3] = (Aluno) objectInput.readObject();
            alunos[4] = (Aluno) objectInput.readObject();
            alunos[5] = (Aluno) objectInput.readObject();

            // Close the streams:

            objectInput.close();

            fileInput.close();

        }

        catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

        // Print the objects:

        System.out.println("Objects read from file: ");

        for(int i = 0; i < 6; i++) {

            System.out.println(alunos[i]);

        }

    }

}
