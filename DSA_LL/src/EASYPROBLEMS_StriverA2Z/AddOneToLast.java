package EASYPROBLEMS_StriverA2Z;

public class AddOneToLast {
    public static void main(String[] args) {
        int [] arr = {9,9,9};
        ListNode list = new ListNode();
        Node head = list.constructLL(arr);
        list.DisplayLL(head);
        System.out.println();
       Node res = AddOne(head);
       list.DisplayLL(res);
    }

    public  static  Node AddOne(Node head){
        if(head==null){
            return null;
        }
        Node curr = head;
        Node prev = null;
        while(curr.next!=null){
            curr = head.next;
            head.next = prev;
            prev = head;
            head =curr;
        }
        head.next = prev;

        int carry =1;
         prev = null;

        while(curr.next!=null){
           int val = curr.data;
           val=val+carry;
            carry=val/10;
           val=val%10;
           curr.data = val;
            curr = head.next;
            head.next = prev;
            prev = head;
            head =curr;
        }

         if(head.data==9&&carry==1){
            Node n = new Node(1);
            head.data = 0;
            head.next = prev;
            n.next=head;
            head =n;
        }
        else{
            head.data+=carry;
            head.next = prev;
        }

        return head;
    }

}
