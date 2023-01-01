package QueueArray;

public class Queue {
    int size =5;
      int arr[] = new int[size];
      int front =0;
      int rear =0;


    public boolean isFull(){
        if(rear==size){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if (rear == 0){
            return true;
        }
        return false;
    }
      public void enqueue(int data){
          if(isFull()){
              System.out.println("QUEUE IS FULL");
          }
         else{
             arr[rear++]=data;
          }
      }

      public void dequeue(){
          if(isEmpty()){
              System.out.println("Queue is empty");
          }
          else if(front==rear){
              rear =0;
              front=0;
          }
          else{
              front++;
          }
    }

    public void display(){
          if(isEmpty() ){
              System.out.println("Queue is empty");
          }
          else{
              for (int i = front; i <rear; i++) {
                  System.out.println(arr[i]);
              }
          }
    }

    public int  peek(){
          if(isEmpty()){
              System.out.println("Queue is Empty");
          }

              return arr[front];

    }



}
