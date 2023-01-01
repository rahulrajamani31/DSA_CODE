import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////////////////////////////////////
        //2D ARRAY WITH DIFFERENT LENGTH OF ROWS AND COLUMNS
        int matrix[][] = {{1, 2, 3, 4, 5}, {6, 7, 8}, {10, 11, 12, 13}, {0}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        /////////////////////////////////////////////////////////////////////////////////////
        //2D ARRAYS WITH EQUAL NUMBER OF ROWS AND COLUMNS
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        /////////////////////////////////////////////////////////////////////////////////////

        //A Matrix Will have a Total of m*n elements in it where m is the row and n is the column

    }
}