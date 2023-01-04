package ROUGHWORKS;

import java.util.*;

public class toggle {
    public static void main(String[] args) {
       int [] a = {1,2,2,1,2};
       int n=5;
       int k=2;
        long ll = 0;
        HashMap<Long, List<Long>> hash = new HashMap<>();


        for(int i=0;i<a.length;i++){
            long fl = (long) a[i];
           if(hash.get(fl)==null){
               hash.put(fl,new ArrayList<>());
           }
            hash.get(fl).add(ll);
            ll++;

        }
//        HashMap<Long,List<Long>> map = new HashMap<>();
//        long len =0;
//        for (long i:a ) {
//            map.putIfAbsent(i,new ArrayList<>());
//            map.get(i).add(len);
//            len++;
//        }
        long op = 0;

        for (Map.Entry<Long,List<Long>> entry : hash.entrySet()) {
            int flag = 0;
            List<Long> getll = entry.getValue();
            if(!getll.isEmpty())
                while (flag < getll.size()){
                    int flag2 = flag+1;
                    while (flag2 < getll.size()){
                        if(getll.get(flag2) - getll.get(flag) >= k){
                            op+=(getll.size()-flag2);
                            break;
                        }
                        flag2++;
                    }
                    flag++;
                }
        }
        System.out.println(op);
//        HashMap<Long,List<Long>> map = new HashMap<>();
//        long len =0;
//        for (long i:a ) {
//            map.putIfAbsent(i,new ArrayList<>());
//            map.get(i).add(len);
//            len++;
//        }
//        long res = 0;
//
//        for (Map.Entry<Long,List<Long>> entry : hash.entrySet()) {
//            int i = 0;
//            List<Long> r = entry.getValue();
//            if(!r.isEmpty())
//                while (i < r.size()){
//                    int j = i+1;
//                    while (j < r.size()){
//                        if(r.get(j) - r.get(i) >= k){
//                            res+=(r.size()-j);
//                            break;
//                        }
//                        j++;
//                    }
//                    i++;
//                }
//        }
//        System.out.println(res);
    }
}
