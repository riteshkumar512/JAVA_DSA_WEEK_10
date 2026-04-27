package Assignment_07;

import java.util.Scanner;

public class Recursion_subsequence {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ques=sc.next();
        print( ques,"");
        System.out.println();
        System.out.print(count);
    }
    public static void print(String ques,String ans){
        if (ques.length()==0){
            System.out.print(ans+" ");
            count++;
            return ;
        }
        char ch=ques.charAt(0);
        print(ques.substring(1),ans);
        print(ques.substring(1),ans+ch);
    }
}