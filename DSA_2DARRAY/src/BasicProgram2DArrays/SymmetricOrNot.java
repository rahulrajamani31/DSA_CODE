package BasicProgram2DArrays;
//https://www.geeksforgeeks.org/program-to-check-if-a-matrix-is-symmetric/
public class SymmetricOrNot {
    public static void main(String[] args) {
        int [][] arr= {{1,2,3},{2,1,4},{3,4,3}};
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]!=arr[j][i]){
                    flag=1;
                    break;
                }
            }
        }
        if(flag==1){
            System.out.println("Not symmetric");
        }
        else{
            System.out.println("Symmetric");
        }
    }
}
