package ROUGH;

import java.util.Arrays;

//https://leetcode.com/problems/reverse-words-in-a-string/
public class ReverseWords {
    public static void main(String[] args) {
        String s ="a good   example";
        String [] arr = s.split(" ");
        String res = "";

        for (int i = arr.length-1; i>=0 ; i--) {
            if(arr[i].equals("")){
                continue;
            }
            String val = arr[i].trim();
            System.out.println(val);
        }
    }
}
