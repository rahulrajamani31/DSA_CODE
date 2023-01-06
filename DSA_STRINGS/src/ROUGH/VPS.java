package ROUGH;

import java.util.Stack;

public class VPS {
    public static void main(String[] args) {
        String s ="8*((1*(5+6))*(8/6))";
       int res = getNesting(s);
        System.out.println(res);
    }

    static int getNesting(String s){

        int max =0;
        int sum =0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                sum++;
                max =Math.max(max,sum);
            }
            if(s.charAt(i)==')'){
                sum--;
            }
        }
        return max;
    }
}
