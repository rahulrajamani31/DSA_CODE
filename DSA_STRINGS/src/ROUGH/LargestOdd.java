package ROUGH;

public class LargestOdd {
    public static void main(String[] args) {
        String s = "52";
        System.out.println(getodd(s));
    }

    static String getodd(String s ){
        for(int i = s.length()-1;i>=0;i--){
            int a = s.charAt(i)-48;
            if(a%2!=0){
                return s.substring(0,i+1);
            }
        }

        return "";
    }
}
