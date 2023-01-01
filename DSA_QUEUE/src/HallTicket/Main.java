package HallTicket;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
//          String s = sc.nextLine();
        Queue que1 = new Queue(10);

          String s = "Andy,Sana,Nick,Sam,George,Veronica,Samar,Serena,Roger,Shanaya";
          String arr [] = s.split(",");
        for (int i = 0; i < arr.length; i++) {
            que1.enqueue(arr[i].trim());
        }

        System.out.println("Queue 1:");


    }
}
