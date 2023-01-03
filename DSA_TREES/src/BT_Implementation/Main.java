package BT_Implementation;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = tree.CreateTree();
        tree.Levelorder(root);

    }
}
