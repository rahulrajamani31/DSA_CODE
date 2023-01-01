package SLIDINGWINDOW;

public class DynamicSize {
    public static void main(String[] args) {
        int [] arr = {5,1,3,4,10,7,4,9,2,14};
        int sum=15;
        naive(arr,sum);
        DynamicWindow(arr,sum);
    }


    public static void DynamicWindow(int[]arr,int sum){
        int i=0;
        int j=0;
        int n=arr.length;
        int ans =0;
        int min =Integer.MAX_VALUE;


        for ( j=0; j <n ; j++) {
            ans=ans+arr[j];
            while(ans>=sum){
                min =Math.min(min,j-i+1);
                ans-=arr[i++];
            }
        }
        System.out.println(min);
    }
    public static void naive(int []arr,int sum){
        int min = Integer.MAX_VALUE;
        int n=arr.length;
        int res = 0;
        int ans =0;
        for(int i=0;i<n;i++){
            res=0;
            ans=0;
            for (int j = i; j <n ; j++) {
                ans=ans+arr[i];
                res++;
                if(ans>=sum){
                    if(res<min){
                        min=res;
                    }
                    break;
                }
            }


        }

        System.out.println(min);
    }
}
