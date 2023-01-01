package Shankar;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int n,j=0,tim=0,i,last;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        Queue q = new Queue(n);
        int[] a=new int[n];
        int[] b=new int[n];

        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
            q.enQueue(a[i]);
            //Fill your code here

            for(i=0;i<n;i++)
                b[i]=sc.nextInt();
        while(j!=n){

            if(b[j]!=q.front()){

                int insert = q.deQueue();
                q.enQueue(insert);
//                System.out.println(Arrays.toString(q.arr));
            //Fill your code here
            tim++;
        }
        else{
            //Fill your code here/
//                System.out.println(q.arr[q.front]);
                q.front++;
            tim++;
            j++;
        }
    }
    System.out.println(tim);
}
}


 class Queue{
      int size ;
     int [] arr = new int[0];
   int front = 0;
   int rear =0;

   public Queue(int size){
       this.size = size;
       arr = new int[size];
   }

   public boolean isEmpty(){
       if(rear==front){
           return true;
       }
       return false;
   }

    public boolean isFull(){
        if(rear==size){
            return true;
        }
        return false;
    }

    public void enQueue(int data)
    {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            arr[rear++]=data;
        }
    }

    public int deQueue()
    {
        int val = arr[front];
        for(int i=front;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        rear--;
        return val;

    }

    public int front()
    {
        return arr[front];
    }


}