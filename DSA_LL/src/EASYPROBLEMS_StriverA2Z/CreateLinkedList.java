package EASYPROBLEMS_StriverA2Z;

public class CreateLinkedList {
    public static void main(String[] args) {
       int [] arr = {1,2,3,4,5};
       Node head = constructLL(arr);
       DisplayLL(head);
    }

    static Node constructLL(int arr[]) {
        Node head = null;
        Node tail = null;

        for(int i=0;i<arr.length;i++){
            Node n = new Node(arr[i]);
            if(head==null){
                head = n;
                tail=n;
            }
            else{
                tail.next = n;
                tail = n;
            }
        }
        return head;
    }

    static void DisplayLL(Node head){
        if(head==null){
            System.out.println("Empty list");
        }
        else{
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.data+"->");
                temp=temp.next;
            }
        }
    }
}



