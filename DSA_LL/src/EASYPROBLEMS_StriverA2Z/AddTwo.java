package EASYPROBLEMS_StriverA2Z;

public class AddTwo {
    public static void main(String[] args) {
        int [] arr = {2,4,3};
        int [] arr2 ={5,6,4};
        ListNode list = new ListNode();
        Node l1 = list.constructLL(arr);
        Node l2 = list.constructLL(arr2);
        list.DisplayLL(l1);
        list.DisplayLL(l2);
        System.out.println();
        Node res = Addtwo(l1,l2);
        list.DisplayLL(res);
    }
    public static Node Addtwo(Node l1,Node l2){
        Node res = null;
        Node tail =null;
        int carry =0;
        int val1=0;
        int val2 =0;

        while(l1!=null||l2!=null){
            val1=0;
            val2=0;
            if(l1!=null){
                val1 =l1.data;
               l1=l1.next;
            }
            if(l2!=null){
                val2=l2.data;
                l2=l2.next;
            }
            int sum=val1+val2+carry;
            carry = sum/10;
            sum=sum%10;
            Node n = new Node(sum);
            if(res==null){
                res =n;
                tail=n;
            }else{
                tail.next =n;
                tail=n;
            }

        }
        if(carry>0){
            Node n = new Node(carry);
            tail.next=n;
            tail=n;
        }
        return res;
    }
}
