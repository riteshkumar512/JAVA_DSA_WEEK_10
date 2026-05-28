package Assignment_07;

import java.util.Scanner;

public class Recursion_Lexicographical_Order {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintLexicographicaLNum(n,0);

    }
    public static void PrintLexicographicaLNum(int n,int curr){
        if (curr>n){
            return;
        }
        System.out.print(curr+" ");
        int i = 0;
        if (curr==0){
            i=1;
        }
        for (; i < 9; i++) {
            PrintLexicographicaLNum(n,curr*10+i);

        }
    }
}
