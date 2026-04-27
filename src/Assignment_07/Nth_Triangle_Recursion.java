package Assignment_07;

import java.util.Scanner;

public class Nth_Triangle_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printNTriangle(n));
    }
    public static int printNTriangle(int n){
        if (n==1){
            return 1;
        }
        return  n + printNTriangle(n-1);
    }
}
