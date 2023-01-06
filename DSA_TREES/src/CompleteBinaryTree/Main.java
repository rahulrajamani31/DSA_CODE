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

        System.out.println("INORDER ITERATION TRAVERSAL");
        tree.inorder_iter(head);
        System.out.println();

        System.out.println("PREORDER TRAVERSAL");
        tree.preorder(head);
        System.out.println();

        System.out.println("PREORDER ITERATION TRAVERSAL");
        tree.preorder_iter(head);
        System.out.println();

        System.out.println("POSTORDER TRAVERSAL");
        tree.postorder(head);
        System.out.println();

        System.out.println("POSTORDER ITERATION TRAVERSAL");
        tree.postorder_iter(head);
        System.out.println();

    }
}
