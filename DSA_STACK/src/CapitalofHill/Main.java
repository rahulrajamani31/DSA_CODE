package CapitalofHill;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hills hill = new Hills();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            arr[i]=val;
        }

        int res = hill.findPairCount(arr);
        System.out.println(res);
    }
}
class pair{
    int first;
    int second;

    public pair(int first ,int second){
        this.first =first;
        this.second = second;

    }
}

 class Hills {
    Stack<pair> s = new Stack<>();
    public Integer findPairCount(int[] arr) {
         int count =0;
        for(int i=0;i<arr.length;i++)
        {
            while(!s.empty() && s.peek().first<arr[i])
            {
                count+=s.peek().second;
                s.pop();
            }
            if(s.empty())
                s.push(new pair(arr[i],1));
            else if( arr[i]==s.peek().first)
            {
                count+=s.peek().second;
                if(s.size()>1)count++;
                s.peek().second++;
            }
            else
            {
                count++;
                s.push(new pair(arr[i],1));
            }
        }
        return count;

    }

}
