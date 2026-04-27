package Assignment_07;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        OddEvenPrint(n);
    }
    public static void OddEvenPrint(int n) {
        if (n == 0) return;

        if (n % 2 != 0) {
            System.out.println(n);
        }

        OddEvenPrint(n - 1);

        if (n % 2 == 0) {
            System.out.println(n);
        }
    }
}
