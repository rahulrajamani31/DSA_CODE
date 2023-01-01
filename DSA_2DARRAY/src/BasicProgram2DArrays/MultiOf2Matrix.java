package BasicProgram2DArrays;

import java.util.Arrays;
//https://www.csinfo360.com/2021/01/program-to-find-multiplication-of-two-matrices.html
public class MultiOf2Matrix {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{2,3,4},{1,2,3}};

        int [][] output = {{0,0,0},{0,0,0}};
        System.out.println("Before Multiplication");
        System.out.println(Arrays.deepToString(output));
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                output[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        System.out.println("After Multiplication");
        System.out.println(Arrays.deepToString(output));
    }
}
