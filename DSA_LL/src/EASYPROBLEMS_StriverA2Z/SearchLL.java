package EASYPROBLEMS_StriverA2Z;

public class SearchLL {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int key =31;
        ListNode node  = new ListNode();
        Node head = node.constructLL(arr);
        System.out.println(search(head,key));

    }

    public static boolean search(Node head,int key){
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
