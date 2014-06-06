package Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        CreateMatrix matrix1 = new CreateMatrix(); //create instance of class "CreateMatrix"

        System.out.println("Input 'widht' of the matrix №1 ");
        matrix1.setA(Integer.parseInt(reader.readLine()));
        System.out.println("Input 'length' of the matrix №1 ");
        matrix1.setB(Integer.parseInt(reader.readLine()));

        matrix1.createMatrix();
        matrix1.printMatrix();

        CreateMatrix matrix2 = new CreateMatrix();
        System.out.println("Input 'widht' of the matrix №2 ");
        matrix2.setA(Integer.parseInt(reader.readLine()));
        System.out.println("Input 'length' of the matrix №2 ");
        matrix2.setB(Integer.parseInt(reader.readLine()));

        matrix2.createMatrix();
        matrix2.printMatrix();

        matrix1.multiMatrix(matrix2.getMatrix());
    }
}
