package BT_Implementation;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree {
    Scanner sc = new Scanner(System.in);
    Node root;
    public BinaryTree(){
        root = null;
    }


    public Node CreateTree(){
        int data;
        System.out.println("Enter -1 to end this create tree function");
        System.out.println("Enter the data to be inserted:");
        data=sc.nextInt();
        if(data==-1){
            return null;
        }
        Node n = new Node(data);
        if(root ==null){
            root =n;
        }
        System.out.println("Enter the left child: ");
        n.left = CreateTree();
        System.out.println("Enter the right child: ");
        n.right = CreateTree();
        return n;
    }

    public void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
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
