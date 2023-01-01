package Sorting;

import java.util.Arrays;

public class RowSortMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{9,3,5,1,7},{2,4,8,12,10},{6,17,16,15,14}};

        int arr[]=new int[10];

        for (int i = 0; i < matrix.length; i++) {
            arr = new int[matrix[i].length];
            for (int j = 0; j < matrix[i].length; j++) {
                arr[j]=matrix[i][j];
            }
            Arrays.sort(arr);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=arr[j];
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
