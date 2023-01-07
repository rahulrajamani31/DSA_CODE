package GREEDY;

import java.util.PriorityQueue;
import java.util.Queue;

public class GasStationSum {
    public static void main(String[] args) {
        int gas[]={5,8,2,8};
        int cost[] ={6,5,6,6};
         int index = getIndex(gas,cost);
        System.out.println(index);
    }

  public static int getIndex(int[] gas, int[] costs){
        int sum=0;
        int tankfill =0;
        int res =0;
        for (int i = 0; i < gas.length; i++) {
            sum=sum+gas[i]-costs[i];
            tankfill =tankfill+gas[i]-costs[i];
            if(tankfill<0){
                res=i+1;
                tankfill =0;
            }
        }
       if(sum>=0){
           return res;
       }
       return -1;
    }
}

