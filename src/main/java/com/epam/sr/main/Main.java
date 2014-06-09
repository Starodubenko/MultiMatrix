package com.epam.sr.main;

import com.epam.sr.matrix.Matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Input 'Width'");
        int width1 = Integer.parseInt(reader.readLine());
        System.out.println("Input 'Length'");
        int length1 = Integer.parseInt(reader.readLine());

        Matrix matrix1 = new Matrix(width1,length1);
        matrix1.createRandomMatrix(10);
        matrix1.printMatrix();


        System.out.println("Input 'Width'");
        int width2 = Integer.parseInt(reader.readLine());
        System.out.println("Input 'Length'");
        int length2 = Integer.parseInt(reader.readLine());

        Matrix matrix2 = new Matrix(width2,length2);
        matrix2.createRandomMatrix(10);
        matrix2.printMatrix();


        matrix1.multiplyMatrix(matrix2.getValues());
    }
}
