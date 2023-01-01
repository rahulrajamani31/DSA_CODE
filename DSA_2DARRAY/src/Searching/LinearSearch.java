package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int target =23;
        boolean res = search(arr,target);
        if ((res)) {
            System.out.println("Element present");
        } else {
            System.out.println("Element Not present");
        }
    }

    public static boolean search(int[][]arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}
