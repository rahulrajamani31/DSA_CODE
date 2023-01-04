package ROUGHWORKS;

public class toggle2 {
    public static void main(String[] args) {
        int n=5;
        int [] nums = {1,0,0,0,1};

        int getprevious =0;
        int ones = 0;
        int zeros = 0;
        int next =0;

        for (int k = 0; k <n ;) {
            while (k < n && nums[k] == 1){
                k++;
                getprevious++;
            }
            while (k<n && nums[k] == 0){
                zeros++;
                k++;
            }
            while (k<n && nums[k] == 1){
                k++;
                next++;
            }
            if(ones<getprevious+zeros+next){
                ones = getprevious+zeros+next;
            }

            getprevious =next;
            zeros = 0;
            next = 0;
        }
        System.out.println(ones);
    }
}
