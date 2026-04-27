package Assignment_07;

import java.util.Scanner;

public class Replace_all_0s_with_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(replace0with5(n,0));

    }
    public static int replace0with5(int n,int ans){
        if (n==0){
           return reverseNum(ans);
        }
        int digit=n%10;
        if (digit==0){
            digit=5;
        }
        ans= ans*10+digit;
        return replace0with5(n/10,ans);
    }

    public static int reverseNum(int n){
        int rev=0;
        while (n>0){
            rev =(rev*10)+ n%10;
            n=n/10;
        }
        return rev;
    }
}
