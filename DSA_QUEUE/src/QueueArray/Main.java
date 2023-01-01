package QueueArray;

public class Main {
    public static void main(String[] args) {
             Queue q = new Queue();
             q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();

        q.display();
         int val= q.peek();
        System.out.println(val);

    }
}
