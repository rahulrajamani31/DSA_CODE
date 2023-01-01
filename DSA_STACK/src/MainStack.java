import java.util.ArrayList;

public class MainStack {
    public static void main(String[] args) {
           StackImplement stack = new StackImplement();
           boolean bool1 = stack.isEmpty();

           stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
boolean bool2 = stack.isEmpty();
        stack.peek();
        stack.display();
         stack.pop();
        stack.peek();
        stack.display();
        stack.reverse();
        stack.display();
        stack.pop();
        stack.display();

        System.out.println(bool1+" "+bool2);

    }
}
