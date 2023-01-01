package BasicProgram2DArrays;

import java.util.Arrays;

//https://www.csinfo360.com/2021/01/find-position-of-element-in-2d-array.html
public class FindPos {
    public static void main(String[] args) {
        int [][] arr1 = {{1,2,3},{4,5,6}};
        int target =5;
        int flag =0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
               if(arr1[i][j]==target){
                   System.out.println("("+i+","+j+")");
                   flag=1;
                   break;
               }
            }
        }

        if(flag==0){
            System.out.println("element not present");
        }

    }
}
