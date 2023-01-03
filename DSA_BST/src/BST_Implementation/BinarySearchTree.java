package BST_Implementation;

public class BinarySearchTree {
    Node root;
    public BinarySearchTree(){
        root = null;
    }
    public void InsertNode(int data){
        Node n = new Node(data);
        if(root==null){
            root = n;
        }else{
            Node temp =root;
            while(true){
                if(temp.data>=data){
                    if(temp.left==null){
                        temp.left=n;
                        break;
                    }
                    temp=temp.left;
                }else if(temp.data<data){
                    if(temp.right==null){
                        temp.right=n;
                        break;
                    }
                    temp=temp.right;
                }
            }

        }
    }
    public Node getRoot(){
        return root;
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
