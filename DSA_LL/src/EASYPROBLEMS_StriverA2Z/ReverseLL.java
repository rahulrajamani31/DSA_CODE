package EASYPROBLEMS_StriverA2Z;

public class ReverseLL {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        ListNode list = new ListNode();
        Node head = list.constructLL(arr);
        list.DisplayLL(head);
        System.out.println();
        Node res = reverse(head);
        list.DisplayLL(res);
    }

    public static Node reverse(Node head){
        Node prev =null;
        Node curr = head;

        while(curr.next!=null){
            curr=head.next;
            head.next =prev;
            prev = head;
            head = curr;
        }
         head.next = prev;

        return head;

    }
}
