package ROUGH;

public class RotateString {
    public static void main(String[] args) {
        String s ="abcde";
        String goal ="cdeab";
      boolean res=   RotateString(s,goal);

    }

    static boolean rotateString(String A, String B) {
        return A.length() == B.length() && (A + A).contains(B);
    }

    static boolean RotateString(String s , String goal){
        for (int i = 0; i < s.length(); i++) {
            char f2 = s.charAt(0);
            s=s.substring(1);
            s=s+f2;
            if(s.equals(goal)){
                return true;
            }
        }
        return false;
    }
}
