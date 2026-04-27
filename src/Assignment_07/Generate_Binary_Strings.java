package Assignment_07;

import java.util.Scanner;

public class Generate_Binary_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            BinaryString(s, "");
        }

    }
    public static void BinaryString(String str,String ans){
        if (str.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch=str.charAt(0);
        if (ch=='?'){
            BinaryString(str.substring(1),ans+'0');
            BinaryString(str.substring(1),ans+'1');
        }else{
            BinaryString(str.substring(1),ans+ch);
        }
    }
}
