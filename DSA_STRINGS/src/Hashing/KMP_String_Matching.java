package Hashing;

import java.util.*;
public class KMP_String_Matching {

  static   void computeLPSArray(String pat, int M, int lps[])
    {
        int len = 0;
        int i = 1;
        lps[0] = 0;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            }
            else
            {
                if (len != 0) {
                    len = lps[len - 1];
                }
                else
                {
                    lps[i] = len;
                    i++;
                }
            }
        }
        System.out.println(Arrays.toString(lps));

    }

    public static void main(String args[])
    {
       String pattern = "aabaabaaa";
       int n = pattern.length();
       int[] lps = new int[n];
        computeLPSArray(pattern,n,lps);
    }
}

