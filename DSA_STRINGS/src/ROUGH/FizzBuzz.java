package ROUGH;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int n=5;
        for (int i =1; i <=n ; i++) {
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Buzz");
            }
            else{
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
    }
}
