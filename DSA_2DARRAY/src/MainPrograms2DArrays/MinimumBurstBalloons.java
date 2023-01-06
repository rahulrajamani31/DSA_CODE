package MainPrograms2DArrays;

import java.util.Arrays;

public class MinimumBurstBalloons {
    public static void main(String[] args) {
        int [][]arr = {{-2147483646,-2147483645},{2147483646,2147483647}};
        Arrays.sort(arr,(first,second)->Integer.compare(first[1],second[1]));
        int getmax = arr[0][1];
          int result =1;
        for (int i = 0; i < arr.length; i++) {
            if(getmax>=arr[i][0]){

            }
            else{
               result++;
               getmax=arr[i][1];
            }
        }
        System.out.println(Arrays.deepToString(arr));
//        System.out.println(result);
    }
}
