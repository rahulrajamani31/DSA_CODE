package MainPrograms2DArrays;

import java.util.HashMap;

public class LongestHappyPrefix {
    public static void main(String[] args) {
        String s ="aaaaa";
        HashMap<String,Integer>map = new HashMap<>();
        String f2 = s.substring(1,s.length());
        for (int i = 1; i < s.length(); i++) {
            String flag = s.substring(0,i);
            map.put(flag,0);
        }
        if(map.containsKey(f2)){
           System.out.println(f2);
       }
        for (int i = 1; i < f2.length(); i++) {
            String flag = f2.substring(i);
            if(map.containsKey(flag)){
                System.out.println(flag);
                break;
            }
        }









//        String f1 = s.substring(0,s.length()-1);
//        String f2 = s.substring(1,s.length());
//       if(f1.contains(f2)){
//           System.out.println(f2);
//       }
//
//        for (int i = 1; i < f2.length(); i++) {
//            String flag = f2.substring(i);
//            if(f1.contains(flag)){
//                System.out.println(flag);
//                break;
//            }
//        }

    }
}
