package KUNALStrings.EASY;

import java.util.Arrays;

public class DefangingIP {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String [] arr = address.split("\\.");
        String res ="";
        for (int i = 0; i < arr.length-1; i++) {
             res=res+arr[i]+"[.]";
        }
        res=res+arr[arr.length-1];
    }
}
