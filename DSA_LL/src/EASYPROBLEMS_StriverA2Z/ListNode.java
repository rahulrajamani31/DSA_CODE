package EASYPROBLEMS_StriverA2Z;

public class ListNode {
    Node head = null;

    public Node constructLL(int[] arr) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < arr.length; i++) {
            Node n = new Node(arr[i]);
            if (head == null) {
                head = n;
                tail = n;
            } else {
                tail.next = n;
                tail = n;
            }
        }
        return head;
    }

    public void DisplayLL(Node head) {
        if (head == null) {
            System.out.println("Empty list");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
        }
    }
}