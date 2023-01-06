package SlidingWindow;

public class WordPattern {
    public static void main(String[] args) {
        String s = "CodeNCode is the best resource for competitive coding Coders";
        String pattern = "co";

        for(int i=0;i<s.length()-pattern.length()+1;i++){
            String flag = s.substring(i,i+pattern.length());
            if(flag.equals(pattern)){
                System.out.println(i);
            }
        }
    }
}
