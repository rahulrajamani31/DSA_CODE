package BasicProgram2DArrays;
//https://www.csinfo360.com/2021/01/program-to-read-and-display-matrix.html


import java.util.Scanner;

public class Print2DArray {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                  matrix[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+":");
            }
            System.out.println();
        }
    }
}
