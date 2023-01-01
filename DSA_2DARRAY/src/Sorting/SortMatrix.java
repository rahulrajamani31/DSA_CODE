package Sorting;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{9,3,5,1,2},{7,4,8,12,10},{19,17,16,15,14}};
        int m = matrix.length;
        int n= matrix[0].length;
         int [] arr = new int [n*m];
         int k=0;
         for(int i=0;i<matrix.length;i++){
             for (int j = 0; j < matrix[i].length; j++) {
                 arr[k++]=matrix[i][j];
             }
         }
        System.out.println("Before Sorting");
        System.out.println(Arrays.deepToString(matrix));
        Arrays.sort(arr);
         int l=0;
        for(int i=0;i<matrix.length;i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=arr[l++];
            }
        }
        System.out.println("After Sorting");
        System.out.println(Arrays.deepToString(matrix));
    }
}
