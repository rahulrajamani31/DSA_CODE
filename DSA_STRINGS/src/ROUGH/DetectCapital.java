package ROUGH;

public class DetectCapital {
    public static void main(String[] args) {
        String word ="FlaG";
        int captial =0;
        int lower =0;
        for (int i = 0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))){
                lower++;
            }
           else if(Character.isUpperCase(word.charAt(i))){
                captial++;
            }
        }

        if(word.length()==captial || word.length()==lower || Character.isUpperCase(word.charAt(0))&&word.length()-1==lower){
            System.out.println("true");
        }
        else {
            System.out.println("False");
        }
    }
}
