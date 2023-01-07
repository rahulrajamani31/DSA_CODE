package Hashing;
//When a text is given and apattern is given then
public class RabinKarpAlgorithm {
    static int hash =10;
    public static void main(String[] args) {

          String s = "abcccccaba";
          String pattern = "aba";

          int pattern_hash = 0;
          int s_hash =0;
          int modulo = Integer.MAX_VALUE;
          int fl=0;

          for (int i = pattern.length()-1; i >=0 ; i--) {
              //Creating Hash
                   pattern_hash =pattern_hash+ pattern.charAt(fl)*(int)Math.pow(hash,i);
                   s_hash =s_hash+ s.charAt(fl)*(int)Math.pow(hash,i);
        }
          pattern_hash =pattern_hash%modulo;
          s_hash =s_hash%modulo;

        for (int i = 0; i < s.length()-pattern.length(); i++) {
               if(pattern_hash==s_hash){
                   System.out.println("True");
                   break;
               }
               else{
                   int flag = (s.charAt(i))*(int)Math.pow(hash,2);
                   s_hash=(s_hash-flag)* hash;
                   flag = (s.charAt(i+pattern.length()))*(int)Math.pow(hash,0);;
                   s_hash=s_hash+flag;
               }
        }
    }
}
