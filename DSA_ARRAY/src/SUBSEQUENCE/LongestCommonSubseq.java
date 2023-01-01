package SUBSEQUENCE;

import java.util.Arrays;

//Print the length length of the longest common subsequence
public class LongestCommonSubseq {
    public static void main(String[] args) {
        String  x = "abaaba";
        String y = "bab";

        int [][] matrix = new int [x.length()+1][y.length()+1];

        for(int i=1;i<=x.length();i++){
            for(int j=1;j<=y.length();j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    matrix[i][j]=1+matrix[i-1][j-1];
                }
                else{
                    matrix[i][j]= Math.max(matrix[i][j-1],matrix[i-1][j]);
                }
            }
        }
        System.out.println("The lenght of the longest common subsequence is:::"+matrix[x.length()][y.length()]);
    }
}
