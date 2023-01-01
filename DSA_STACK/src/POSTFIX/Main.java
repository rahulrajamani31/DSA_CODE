package POSTFIX;

import java.util.*;


public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        Stack stk = new Stack();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
              stk.push(val);
        }
        System.out.println("Noted Down values are");
        ArrayList<Object> odd = new ArrayList<>();
        ArrayList<Object> even = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            Object ret = stk.pop();
            int val = (int)ret;
            if(val%2==0){
                even.add(ret);
            }
            else{
                odd.add(ret);
            }
            System.out.print(ret+" ");
        }
        System.out.println("Rearranged Values are");

        for (int i = odd.size()-1; i >=0; i--) {
            System.out.print(odd.get(i)+" ");
        }
        for (int i = even.size()-1; i >=0; i--) {
            System.out.print(even.get(i)+" ");
        }

    }
}


class Stack
{

    ArrayList<Object> list = new ArrayList<>();
   int top =-1;
    public void push(Object o) {
        list.add(o);
        top++;
    }

    public Object pop() {
        //Fill the code here
        Object val = list.get(top);
        top--;
        return val;
    }

    public boolean isEmpty() {
        if(top==-1){
            return true;
        }
        return false;
    }

}

