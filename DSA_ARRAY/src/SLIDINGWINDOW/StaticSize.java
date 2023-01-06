package SLIDINGWINDOW;

public class StaticSize {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,1,8,9,4};
        int k=3;
        //FIND THE MAXIMUM SUBARRAY OF SIZE K
        int max =0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum=sum+arr[i];
        }
        max = Math.max(sum,max);
        for(int i=0;i<arr.length-k;i++){
            sum=sum-arr[i];
            sum=sum+arr[i+k];
            max = Math.max(sum,max);
        }
        System.out.println(max);
    }
}
