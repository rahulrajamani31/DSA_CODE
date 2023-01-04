package ROUGHWORKS;

import java.util.HashMap;

public class MinimumRounds {
    public static void main(String[] args) {
        int [] arr ={7,7,7,7,7,7};
        int res =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            if(map.get(arr[i])==null){
                map.put(arr[i],1);
            }
            else{
                int x =map.get(arr[i]);
                x=x+1;
                map.put(arr[i],x);
            }
        }

        if(map.containsValue(1)){
//            return -1;
            System.out.println(-1);
        }

        for(Integer i : map.keySet()){
            int val = map.get(i);
            if(val==2){
                res=res+1;
            }
            else if(res==3){
                res=res+1;
            }
            else if(val==4){
                res=res+2;
            }
            else{
                res=res+(val/3);
                if(val%3!=0){
                    res=res+1;
                }

            }
        }

        System.out.println(res);
    }
}
