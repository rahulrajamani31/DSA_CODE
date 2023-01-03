package ROUGH;

import java.util.HashMap;

//https://leetcode.com/problems/valid-anagram/
public class Anagram {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s ="anagram";
        String t ="nagaram";

        if(s.length()!=t.length()){
            System.out.println(false);
        }

        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }
            else {
                int x = map.get(s.charAt(i));
                x=x+1;
                map.put(s.charAt(i),x);
            }
        }
        for(int i=0;i<s.length();i++){
            if(map.get(t.charAt(i))==null){
                System.out.println(false);
            }
            else {
                int x = map.get(t.charAt(i));
                if(x==0){
                    System.out.println(false);
                }
                x=x-1;
                map.put(t.charAt(i),x);
            }
        }

        if(map.containsValue(1)){
            System.out.println(false);
        }

        System.out.println(true);
    }
}
