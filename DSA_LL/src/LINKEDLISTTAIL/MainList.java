package LINKEDLISTTAIL;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Linkedll{
    Node head;
    Node tail;
    Node prev;
    public Linkedll(){
        head=null;
        tail=null;
        prev =null;
    }
//ADD DATA AT LAST WITH O(n)
    public void addData(int data){
        Node new_node = new Node(data);

        if(head==null){
            head = new_node;
            tail=new_node;
        }
        else{
            prev=tail;
            tail.next = new_node;
            tail=new_node;

        }
    }
    //REMOVE  DATA AT LAST WITH O(n)
    public void removeData(int data){
        Node new_node = new Node(data);
        if(head==null){
            head=null;
        }
        else{
           prev.next=null;


        }
    }


    public void displayData(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

}
public class MainList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Linkedll list = new Linkedll();

        for (int i = 0; i < 4; i++) {
            int val = sc.nextInt();
            list.addData(val);
        }
        list.displayData();
    }
}
