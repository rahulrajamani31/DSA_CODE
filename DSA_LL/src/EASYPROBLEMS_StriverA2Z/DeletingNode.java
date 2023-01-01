package EASYPROBLEMS_StriverA2Z;
// LINK FOR PROBLEM : https://leetcode.com/problems/delete-node-in-a-linked-list/
public class DeletingNode {
    public static void main(String[] args) {
        int [] arr = {4,5,1,9};
        int node =1;
        ListNode list = new ListNode();
        Node head = list.constructLL(arr);
        list.DisplayLL(head);
        Node temp = selectNode(head,node);
      deleteNode(temp);
        System.out.println();
        list.DisplayLL(head);
    }
    public static Node selectNode(Node head,int val){
        Node temp =head;
        while(temp.next!=null){
            if(temp.data==val){
                return temp;
            }
            temp = temp.next;
        }
        return temp;
    }
    public static void deleteNode(Node node) {
        node.data = node.next.data;
        node.next=node.next.next;
    }


}
