package ConsecutivePairs;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Queue que = new Queue(n);
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            que.Enqueue(val);
        }
      int res =  que.Dequeue();
 if(res<=1){
     System.out.println("Yes");
 }
 else{
     System.out.println("No");
 }

    }
}


class Queue{
    int [] arr;
    int front,rear;
    public  Queue(int size){
        this.arr=new int[size];
        front=0;
        rear=0;
    }

    public void Enqueue(int data){
        arr[rear++]=data;
    }

    public int Dequeue(){
        int val1 =0;
        int val2 =0;
        int flag =1;
        int count= 0;
        while(front!=rear){
            if(front!=rear){
                val1=arr[front];
                front++;
                if(front != rear){
                    val2 = arr[front];
                    front++;
                }
            }
            int res = Math.abs(val1-val2);
            if(res==1 && count==1){
                count = 10;
                break;
            }
            else if(res>1){
                count++;
            }
        }
        return count;
    }
}