package com.epam.sr.matrix;

import java.util.Random;

public class Matrix {

    private String config;
    private int rowsCount;
    private int colsCount;
    private int[][] values;

    public Matrix(int rowsCount, int colsCount) {
        this.rowsCount = rowsCount;
        this.colsCount = colsCount;
        values = new int[rowsCount][colsCount];
    }

    public void createRandomMatrix(int maxValue) {

        values = new int[rowsCount][colsCount];
        Random rnd = new Random();

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                values[i][j] = rnd.nextInt(maxValue);
            }
        }
    }

    public void printMatrix() {

        for (int i = 0; i < rowsCount; i++) {
            String s = "";
            for (int j = 0; j < colsCount; j++) {
                s = s + values[i][j] + " ";
            }
            System.out.println(s);
        }
    }

    public void multiplyMatrix(int[][] matrix2) {

        int[][] multiMatrix = new int[rowsCount][matrix2[0].length]; // A new array for multipled values

        for (int i = 0; i < rowsCount; i++) { //going to the rows of the first values
            for (int l = 0; l < matrix2[0].length; l++) { //going to the columns of the second values
                int sum = 0;                        //sum of the multipled elements
                for (int j = 0; j < colsCount; j++) {      //going to the columns of the fist values and the rows of the second
                    sum = sum + values[i][j] * matrix2[j][l];
                }
                multiMatrix[i][l] = sum; //wright new element for multipled values
            }
        }

        System.out.println("Multipled Matrix");

        for (int i = 0; i < multiMatrix.length; i++) {
            String s = "";
            for (int j = 0; j < multiMatrix[0].length; j++) {
                s = s + multiMatrix[i][j] + " ";
            }

            System.out.println(s);
        }
    }

    public int[][] getValues() {
        return values;
    }
}
