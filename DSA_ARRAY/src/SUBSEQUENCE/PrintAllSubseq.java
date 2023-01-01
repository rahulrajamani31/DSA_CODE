package SUBSEQUENCE;

import java.util.ArrayList;

public class PrintAllSubseq {
    public static void main(String[] args) {
        int [] arr = {3,2,1};
        ArrayList<Integer>list = new ArrayList<>();
        int index =0;
        Printsubseq(arr,index,list);

    }
    public static void Printsubseq(int[] arr , int index, ArrayList <Integer>list){
              if(index>=arr.length){
                  System.out.println(list);
                  return;
              }
              list.add(arr[index]);
              Printsubseq(arr,index+1,list);
              list.remove(list.size()-1);
              Printsubseq(arr,index+1,list);
    }
}
