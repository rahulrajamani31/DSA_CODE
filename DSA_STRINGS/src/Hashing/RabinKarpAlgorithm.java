package Hashing;
//When a text is given and apattern is given then
public class RabinKarpAlgorithm {
    static int hash =10;
    public static void main(String[] args) {
          String s = "aabcc";
          String pattern = "abc";
          int j=pattern.length();
          int h_val = 0;
          int s_val =0;
        for (int i = pattern.length()-1; i >=0 ; i--) {
            h_val =h_val+ pattern.charAt(i)*(int)Math.pow(hash,i);
            s_val =s_val+ s.charAt(i)*(int)Math.pow(hash,i);
        }
//        h_val = h_val%10;
//        s_val = s_val%10;

        for (int i = 0; i < s.length()-pattern.length(); i++) {
               if(h_val==s_val){
                   System.out.println("True");
                   break;
               }
               else{
                   int flag = (s.charAt(i))*(int)Math.pow(hash,2);
                   s_val=(s_val-flag)* hash;
                   flag = (s.charAt(i+j))*(int)Math.pow(hash,0);;
                   s_val=s_val+flag;
               }
        }
    }
}
