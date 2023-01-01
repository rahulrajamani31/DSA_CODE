package HallTicket;

import java.io.*;
import java.util.*;

class Queue
{
    String arr[];
    private int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size){
        arr = new String[size];
        capacity = size;
        front = 0;
        rear = 0;
        count = 0;
    }

    public int size(){
        return count;
    }

    public Boolean isEmpty(){
        return (size() == 0);
    }

    public Boolean isFull()	{
        return (size() == capacity);
    }

    public void enqueue(String item){
             if(isFull()){
                 System.out.println("Queue is full!!!");
             }
             else{
                 arr[count++] = item;

             }
    }

    public List<Queue> hallTicketCollection(Queue q){
        List<Queue> list = new ArrayList<>();
        Queue q1 = new Queue(10);
        Queue q2 = new Queue(10);

        while(front!=rear){

        }





    }
}
