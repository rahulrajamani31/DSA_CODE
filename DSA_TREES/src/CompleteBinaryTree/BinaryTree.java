package CompleteBinaryTree;
import java.util.*;

public class BinaryTree {
    Node root =null;
    boolean flag =true;
    Queue<Node> que =new LinkedList<>();

    public void Insert(int data){
        Node n = new Node(data);
        if(root==null){
            root = n;
            que.add(root);
        }
        else{
            if(flag){
                assert que.peek() != null;
                que.peek().left = n;
                que.add(n);
            }
            else{
                assert que.peek() != null;
                que.peek().right =n;
                que.add(n);
                que.remove();
            }
          flag= !flag;

        }
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+"->");
        inorder(root.right);
    }

    public void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+"->");
        preorder(root.left);
        preorder(root.right);
    }
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+"->");
    }

    public void Levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root==null){
            System.out.println("Tree is empty");
        }
        q.add(root);

        while(!q.isEmpty()){
            System.out.print(q.peek().data+"->");
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
                q.add(q.peek().right);
            }
            q.remove();
        }

    }
}
