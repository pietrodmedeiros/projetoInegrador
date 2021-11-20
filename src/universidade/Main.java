package universidade;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.FileOutputStream;

import java.io.IOException;

import java.io.ObjectInputStream;

import java.io.ObjectOutputStream;

import java.io.Serializable;
import java.util.Date;

public class Main implements Serializable {

    public static void main(String[] args) throws FileNotFoundException, IOException {


        // Create some animals from our Serializable class:
        var endereco1 = new Endereco(801010, "Rua 1", 1, "casa 4", "Centro", "Sao Paulo", "SP", 01);
        var curso1 = new Curso("ADS", 012);
        // Output to the console:


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
            alunos[6] = (Aluno) objectInput.readObject();
            // Close the streams:

            objectInput.close();

            fileInput.close();

        }

        catch (ClassNotFoundException e) {

            e.printStackTrace();

        }

        // Print the objects:

        System.out.println("Objects read from file: ");

        for(int i = 0; i < 3; i++) {

            System.out.println(alunos[i]);

        }

    }

}
