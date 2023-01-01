import java.util.ArrayList;
import java.util.Collections;

public class StackImplement {

  private  ArrayList<Integer> list = new ArrayList<>();
    int top=-1;
    public void push(int data){
        list.add(data);
        top=top+1;
    }

    public void pop(){
        if(top==-1){
            System.out.println("stack is empty");
            return;
        }
        int index = list.size()-1;
        int value = list.get(index);
        list.remove(index);
        System.out.println("The popped value is "+value);
        top--;
    }

    public void peek(){
        System.out.println(list.get(top));
    }

    public void reverse(){
        Collections.reverse(list);
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public int Stacksize(){
        return list.size();
    }
    public void display(){
        System.out.println(list);
    }
}
