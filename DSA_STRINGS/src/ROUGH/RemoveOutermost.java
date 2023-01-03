package ROUGH;

import java.util.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/
public class RemoveOutermost {
    public static void main(String[] args) {
        Stack<Character> stk = new Stack<>();
      String s = "()()";
      String res ="";
        for (int i = 0; i < s.length(); i++) {
                  if(stk.empty()&&s.charAt(i)=='('){
                      stk.push(s.charAt(i));
                  }
                  else if(stk.size()==1&&s.charAt(i)==')'){
                      stk.pop();
                  }
                  else {
                      if(s.charAt(i)=='('){

                          stk.push(s.charAt(i));
                      }
                      else{
                          stk.pop();
                      }
                      res =res + s.charAt(i);
                  }
        }
        System.out.println(res);
    }
}
