package KUNALStrings.EASY;

import java.util.Arrays;

public class ShufleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};

        char op[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            op[arr[i]]=s.charAt(i);
        }
       String res="";
        for (int i = 0; i < s.length(); i++) {
            res=res+op[i];
        }

        
        System.out.println(res);
    }
}
