package MainPrograms2DArrays;

import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int [][] op = new int[arr.length][arr.length];

        int f1 =0;
        int f2 =arr.length-1;

        for (int i = 0; i < arr.length; i++) {
            f1=0;
            for (int j = 0; j < arr.length; j++) {
                op[f1++][f2]=arr[i][j];
            }
            f2--;
        }
        System.out.println(Arrays.deepToString(op));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=op[i][j];
            }
        }
    }
}
