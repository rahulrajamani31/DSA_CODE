package ROUGHWORKS;
//https://leetcode.com/problems/find-triangular-sum-of-an-array/description/
public class TriangularSumofanArray {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
       int res = recursion(arr,0,arr.length-1);
        System.out.println(res);

    }
    public static int recursion(int []arr ,int s , int e){
        if(s==e){
            return arr[s];
        }
        int k = 0;
        for (int i = s; i <e ; i++) {
            arr[k++]=(arr[i]+arr[i+1])%10;
        }
       return recursion(arr,0,k-1);
    }
}
