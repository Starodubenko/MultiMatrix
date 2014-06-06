package Matrix;


import java.util.Random;

public class CreateMatrix {

    private int a; //Matrix length
    private int b; //Matrix width

    public int[][] getMatrix() {
        return matrix;
    }

    private int[][] matrix;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void createMatrix (){ //create matrix

        matrix = new int[a][b];
        Random rnd = new Random();

        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                matrix[i][j] = rnd.nextInt(10);
            }
        }
    }

    public void printMatrix (){ //output the matrix in consol

        for (int i = 0; i < a; i++){
            String s = "";
            for (int j = 0; j < b; j++){
                s = s + matrix[i][j]+" ";
            }
            System.out.println(s);
        }
    }

    public void multiMatrix (int[][] matrix2){

        int[][] multiMatrix = new int[a][matrix2[0].length]; // A new array for multipled matrix

            for (int i = 0; i < a; i++){ //going to the rows of the first matrix
                for (int l = 0; l < matrix2[0].length; l++) { //going to the columns of the second matrix
                    int sum = 0;                        //sum of the multipled elements
                    for (int j = 0; j < b; j++) {      //going to the columns of the fist matrix and the rows of the second
                        sum = sum + matrix[i][j] * matrix2[j][l];
                    }
                    multiMatrix[i][l] = sum; //wright new element for multipled matrix
                }
            }

        System.out.println("Multipled matrix");

        for (int i = 0; i < multiMatrix.length; i++){
            String s = "";
            for (int j = 0; j < multiMatrix[0].length; j++) {
                s = s + multiMatrix[i][j]+" ";
            }

            System.out.println(s);
        }
    }

}
