package Searching;
//BinarySearch is applied only where the 2D array is sorted
public class BinarySearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int target =42;
        boolean res = binarysearch(arr,target);
        System.out.println(res);
    }
    public static boolean binarysearch(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            int k=arr[i].length-1;
            while(k>0&&arr[i][k]>target){
                k--;
            }
            if(arr[i][k]==target){
                return true;
            }
        }
        return false;
    }
}
