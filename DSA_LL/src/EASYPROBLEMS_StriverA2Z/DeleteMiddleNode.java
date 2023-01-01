package EASYPROBLEMS_StriverA2Z;

//Using Fast and slow ponter

public class DeleteMiddleNode {
    public static void main(String[] args) {
        int [] arr = {2,1};
        ListNode list = new ListNode();
        Node head = list.constructLL(arr);
        list.DisplayLL(head);
        System.out.println();
        DeleteMid(head);
        list.DisplayLL(head);
    }

    public static void DeleteMid(Node head){
        Node slow = head;
        Node fast = head;
        if(slow.next==null){
            head=null;
            return ;
        }

        if(slow.next.next==null){
            slow.next =null;
            return;
        }


        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next==null){
            slow.data=slow.next.data;
            slow.next=slow.next.next;
        }
        else{
            slow=slow.next;
            slow.data=slow.next.data;
            slow.next=slow.next.next;
        }
    }
}
