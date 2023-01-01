package ROUGH;

import java.util.Arrays;
import java.util.HashMap;

public class MatchPattern {
    public static void main(String[] args) {

        String s = "abba";
        String word = "dog cat cat dog";
        String [] arr = word.split(" ");
        System.out.println(Arrays.toString(arr));
       boolean res = match(s,arr);
        System.out.println(res);
    }

    public static boolean match(String s ,String[] arr){
        HashMap<Character,String> map = new HashMap<>();
        if(s.length()!=arr.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(map.get(s.charAt(i))==null){
                if(map.get(s.charAt(i))==null){
                    if(map.containsValue(arr[i])){
                        return false;
                    }
                map.put(s.charAt(i),arr[i]);
            }
            else{
                String val = map.get(s.charAt(i));
                if(!val.equals(arr[i])){
                    return false;
                }
                map.put(s.charAt(i),arr[i]);
            }
        }
        return true;
    }
}
