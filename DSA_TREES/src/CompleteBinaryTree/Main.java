package CompleteBinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int arr[]={10,11,12,13,14,15};

        for (int i = 0; i < arr.length; i++) {
            tree.Insert(arr[i]);
        }
        Node head = tree.root;
        System.out.println("INORDER TRAVERSAL");
        tree.inorder(head);
        System.out.println();
        System.out.println("PREORDER TRAVERSAL");
        tree.preorder(head);
        System.out.println();
        System.out.println("POSTORDER TRAVERSAL");
        tree.postorder(head);
        System.out.println();
        System.out.println("LEVEL ORDER TRAVERSAL");
        tree.Levelorder(head);
        System.out.println();

    }
}
