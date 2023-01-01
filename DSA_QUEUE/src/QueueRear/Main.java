package QueueRear;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        do{
            System.out.println("Choice 1 : Enter element into Queue\nChoice 2 : Delete element from Queue\nChoice 3 : Display\nAny other choice : Exit");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("Enter the element to be inserted/entered");
                    int a=sc.nextInt();
                    sc.nextLine();
                    q.enQueue(a);
                    break;
                }
                case 2:
                {
                    //Fill your code here
                    int b = q.deQueue();
                    if(b!=-1000)
                        System.out.println("The deleted element is "+b);
                    break;
                }
                case 3:
                {
                    System.out.print("The contents of the queue are");
                    //Fill your code here
                    q.display();
                    break;
                }
                default:
                {
                    System.exit(0);
                    break;
                }
            }
        }while(choice<4);
    }
}

 class Queue{

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
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else if(front+1 == rear){
            int val = arr[front];
            front=0;
            rear=0;
            return val;
        }
        else{
            int val=arr[front];
            front++;
            return val;
        }

        return  0;
    }

    public void display()
    {
        if(isEmpty() ){
            System.out.print("{}");
        }
        else{
            for (int i = front; i <rear; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }


}