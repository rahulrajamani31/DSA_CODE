package CircularQueue;

public class Circular {
    int arr[] = new int[5];
    int front =0;
    int rear =0;
    int size =0;

    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size==arr.length){
            return true;
        }
        return false;
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            rear = rear%arr.length;
            arr[rear]=data;
            rear++;
            size++;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        else{
            size--;
            front=front%arr.length;
            front++;

        }
    }
}
