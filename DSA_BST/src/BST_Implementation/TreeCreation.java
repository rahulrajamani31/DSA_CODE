package BST_Implementation;

public class TreeCreation {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.InsertNode(10);
        tree.InsertNode(9);
        tree.InsertNode(12);
        tree.InsertNode(11);
        tree.InsertNode(13);
        tree.InsertNode(4);
        tree.InsertNode(10);
        Node root = tree.getRoot();
        tree.inorder(root);


    }

}
