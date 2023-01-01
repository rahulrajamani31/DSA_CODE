package BasicProgram2DArrays;

import java.util.Scanner;

//https://www.csinfo360.com/2021/01/find-sum-of-all-elements-in-2d-array.html
public class SumOfElements {
    public static void main(String[] args) {
        int [][] matrix = new int[3][3];
        Scanner sc = new Scanner(System.in);
        int sum =0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j]=sc.nextInt();
                sum=sum+matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
