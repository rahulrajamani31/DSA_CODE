package Traversal;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        int dir =0;
        int left =0;
        int top =0;
        int down = arr.length-1;
        int right = arr.length-1;

        while(left<=right && top<=down){
            if(dir==0){
                for (int i = left; i <=right ; i++) {
                    System.out.print(arr[top][i]+" ");
                }
                top++;
            }
            else if(dir==1){
                for (int i =top ; i <= down; i++) {
                    System.out.print(arr[i][right]+" ");
                }
                right--;
            }
            else if(dir==2){
                for (int i = right; i >=left ; i--) {
                    System.out.print(arr[down][i]+" ");
                }
                down--;
            }
            else if(dir ==3){
                for (int i = down; i>=top ; i--) {
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
            dir++;
            dir=dir%4;
        }

    }
}
