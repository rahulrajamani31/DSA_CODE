package CircularLL;

class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next =null;
    }
}
public class LinkedCLL {
    Node head = null;
    Node tail = null;
    public LinkedCLL(){
        head=null;
    }

    public void addElement(int data){
        Node nn = new Node(data);

        if(head==null){
            head=nn;
            tail=nn;
        }
        else{
             tail.next = nn;
             tail=nn;
             tail.next=head;
        }
    }


    public void display(){
        Node temp = head;

        if(head==null){
            return;
        }
            while(temp!=tail){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        System.out.print(temp.data+" ");

        }



    public void removeFirst(){

        if(head==tail){
            head=null;
            tail=null;
        }
        else if(head.next==tail){
            tail.next = null;
            head=tail;
        }
        else{
            tail.next = head.next;
            head = tail.next;
        }


    }
}
