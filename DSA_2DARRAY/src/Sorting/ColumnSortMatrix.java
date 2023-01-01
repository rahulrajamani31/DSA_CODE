package Sorting;

import java.util.Arrays;

public class ColumnSortMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{9,3,5,1,7},{2,4,8,12,10},{6,17,16,15,14}};
        int arr[];

        for (int i = 0; i < matrix[0].length; i++) {
            arr = new int[matrix.length];
            for (int j = 0; j < matrix.length; j++) {
                arr[j]=matrix[j][i];
            }
            Arrays.sort(arr);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][i]=arr[j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
