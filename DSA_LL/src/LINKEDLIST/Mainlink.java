package LINKEDLIST;
import java.util.*;

public class Mainlink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Linked list = new Linked();

        list.addNode(10);
        list.addNode(11);
        list.addNode(12);
        list.addNode(13);
        list.addNode(14);
        System.out.println("After Adding elements at last:");
        list.displayData();

        list.removeNode();
        System.out.println("After removing the last element:");
        list.displayData();

        list.addFirst(0);
        System.out.println("After adding element at first:");
        list.displayData();

        list.removefirst();
        System.out.println("After removing element at first:");
        list.displayData();

        list.insertatspecific(4000,8);
        System.out.println("After inserting element at specific location:");
        list.displayData();

        list.delete(4000);
        System.out.println("After DELETING element at specific location:");
        list.displayData();

    }
}
