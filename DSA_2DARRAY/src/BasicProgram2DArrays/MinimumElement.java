package BasicProgram2DArrays;
//https://www.csinfo360.com/2021/01/find-minimum-element-in-matrix.html
public class MinimumElement {
    public static void main(String[] args) {
        int [][] arr = {{6,2,12},{4,1,23}};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]<min){
                    min = arr[i][j];
                }
            }
        }

        System.out.println(min);

    }
}
