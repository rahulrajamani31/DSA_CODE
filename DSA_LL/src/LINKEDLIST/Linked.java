package LINKEDLIST;

import java.util.*;

public class Linked {
    Node head;
    public  Linked (){
        head =null;
    }
    //ADD NODE AT LAST BY TRAVERSING THROUGH LIST O(n)
   public void addNode(int data){
        Node new_node = new Node(data);
        Node temp = head;
        if(head==null){
            head = new_node;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
   }
//REMOVE NODE AT LAST USING TRAVERSING O(n)
public void removeNode(){
    Node temp = head;
    if(head==null){
        head =null;
    }
    else{
        Node prev = null;
        while(temp.next!=null){
            prev = temp;
            temp=temp.next;
        }
        prev.next=null;
    }
}
//DISPLAY THE ALL THE VALUES IN THE LINKED LIST
   public void displayData(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

   }
   //ADD AT FIRST IN LINKED LIST
   public void addFirst(int data){
        Node nn = new Node(data);
        if(head==null){
            head = nn;
        }
        else{
            nn.next=head;
            head=nn;
        }
   }
//REMOVE AT FIRST IN LINKED LIST
   public void removefirst(){
        head = head.next;
   }
//SEARCH AN ELEMENT IN LINKED LIST
   public void search(int data){
        Node temp = head;
        while(temp!=null&&temp.data!=data){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found");
        }
   }
//INSERT AT A SPECIFIC POSITION IN LINKED LIST
   public void insertatspecific(int data,int location){
        Node new_node = new Node(data);
       if (head == null) {
           head = new_node;
       }
       else {
           Node temp = head;
           while(temp.next!=null && location>2){

               temp=temp.next;
               location=location-1;
           }
if(location==1){
    new_node.next=head;
    head= new_node;
}
else{
    new_node.next = temp.next;
    temp.next = new_node;
}
       }
   }

   //DELETE AN ELEMENT

    public void delete(int element){
        Node temp = head;

        if(head.data==element){
            head = temp.next;
        }
        while(temp.next!=null){
            if(temp.next.data==element){
               temp.next =temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }


}
