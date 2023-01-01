package EASYPROBLEMS_StriverA2Z;
//If the number followed by zero then insert at beginning if followed by end then end of the node
public class InsertingNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
//        list.insertNode(9);
//        list.insertNode(0);
        list.insertNode(5);
        list.insertNode(1);
        list.insertNode(6);
        list.insertNode(1);
        list.insertNode(9);
        list.insertNode(1);
//        list.insertNode(5);
//        list.insertNode(0);
       Node head = list.head;
       Node res = Arrange(head);
        Node temp = res;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }
    static Node Arrange(Node res){
        Node head = null;
        Node tail = null;

        while(res!=null){

            Node n = new Node(res.data);
            if(head==null){

                head = n;
                tail =n;
            }
            else{

                if(res.next.data==0){
                    n.next=head;
                    head=n;
                }
                else{
                    tail.next =n;
                    tail =n;
                }
            }

            if(res.next.next == null){
                break;
            }
            res = res.next.next;

        }

        return head;
    }
}

class LinkedList{
    Node head;

    public LinkedList(){
        this.head =null;
    }

    public  void insertNode(int data){
        Node n = new Node(data);
        if(head==null){
            head =n;
        }else{
            Node temp =head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = n;
        }
    }

}