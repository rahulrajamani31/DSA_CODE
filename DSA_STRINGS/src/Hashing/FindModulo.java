package Hashing;

public class FindModulo {


    public static void main(String[] args) {
        String pattern ="aabc";
        int modulo = Integer.MAX_VALUE ;
        int pow1 = 65536;
        int pow2 = 256;
        int pow3 = 1;
        int hash=6382179;
        int new_hash = 6381922;

        new_hash = new_hash - ('a'*(int)Math.pow(256,2)) ;
        new_hash = new_hash*256;
        new_hash = new_hash + ('c'*(int)Math.pow(256,0));
        System.out.println(new_hash);
    }
}
