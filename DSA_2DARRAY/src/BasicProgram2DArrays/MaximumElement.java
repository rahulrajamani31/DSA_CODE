package BasicProgram2DArrays;
//https://www.csinfo360.com/2021/01/find-maximum-element-in-matrix.html
public class MaximumElement {
    public static void main(String[] args) {
        int [][] arr = {{6,2,12},{4,1,23}};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);

    }
}
