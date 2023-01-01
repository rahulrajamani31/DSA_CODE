package DLL;

public class LinkedDLL {
    Node head;
    Node tail;

    public LinkedDLL(){
        head =null;
        tail =null;
    }
//////////////////////////////////////////////////////
    public void Insert(int data){
        Node new_node = new Node(data);
        if(head==null){
            head = new_node;
            tail = new_node;
        }
        else{
            new_node.prev = tail;
            tail.next = new_node;
            tail = new_node;
        }
    }
//////////////////////////////////////////////////////
    public void InsertFirst(int data){
        Node nn = new Node(data);
        if(head==null){
            head = nn;
            tail =nn;
        }
        else{
            nn.next = head;
            head.prev = nn;
            head =nn;
        }
    }
    ////////////////////////////////////////////////////

    public void InsertMiddle(int data ,int position){
        Node nn = new Node(data);
        if(head==null){
            head = nn;
            tail =nn;
        }
        else{
            Node temp = head;
            while(temp.next!=null&&position>0){
                temp=temp.next;
                position--;
            }
            if(temp==tail){
                nn.next = temp.next;
                nn.prev = temp;
                temp.next =nn;
                tail =nn;
            }
            else{
                nn.next = temp.next;
                nn.prev = temp;
                temp.next.prev = nn;
                temp.next =nn;
            }
        }


        }
  ////////////////////////////////////////////////////
    public void Display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    ///////////////////////////////////////////////
    public void ReverseDisplay(){
        Node temp = tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.prev;
        }

    }
    /////////////////////////////////////////////

    public void removefirst(){
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head = head.next;
            head.prev =null;
        }
    }
    //////////////////////////////////////////
    public void removelast(){
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            tail = tail.prev;
            tail.next =null;
        }
    }
    /////////////////////////////////////////////////////
}
