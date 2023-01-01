package EASYPROBLEMS_StriverA2Z;

public class LengthLL {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        ListNode list = new ListNode();
        Node head = list.constructLL(arr);
        list.DisplayLL(head);
        System.out.println("After Counting");
        int res =  countLL(head);
        System.out.println("Count::"+res);
    }

    static int countLL(Node head){
        Node temp =head;
        int count =0;
        if(temp==null){
            return 0;
        }else{
            while(temp!=null){
                count++;
                temp=temp.next;
            }
        }
        return count;
    }
}
