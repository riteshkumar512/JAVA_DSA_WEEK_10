package Assignment_07;

import java.util.Scanner;

public class Recursion_Ascii_Subsequences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("\n"+AsciiRecursion(s,""));


    }
    public static int AsciiRecursion(String str,String ans){
        if (str.length()==0){
            System.out.print(ans+" ");
            return 1;
        }
        char ch=str.charAt(0);
        int x= AsciiRecursion(str.substring(1),ans);
        int y= AsciiRecursion(str.substring(1),ans+ch);
        int z= AsciiRecursion(str.substring(1),ans+(int)ch);
        return x+y+z;
    }
}
