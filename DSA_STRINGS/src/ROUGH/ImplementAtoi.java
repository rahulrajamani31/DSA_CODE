package ROUGH;

public class ImplementAtoi {
    public static void main(String[] args) {
        String s = "-91283472332";
        int res = getAtoi(s);
        System.out.println(res);

    }

    static  int getAtoi(String s){
        int max =Integer.MAX_VALUE;
        int min =Integer.MIN_VALUE;
        long res = 0;
        int sign = 1;
        boolean flag = true;
        boolean f2 = true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==45&&flag&&res==0){
                flag=!flag;
                sign=-1;
            }
            else if(s.charAt(i)==43&&flag&&res==0){
                flag=!flag;
                sign=1;
            }
           else if(47<s.charAt(i) && s.charAt(i)<58){
                int val = s.charAt(i)-48;
                res=(res*10)+val;
                if(res*sign>max){
                    return max;
                }else if(res*sign<min){
                   return min;
                }
            }
           else if(s.charAt(i)==' '){

            }
           else{
               break;
            }

        }
        return (int)res*sign;
    }
}
