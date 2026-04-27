package Assignment_07;

import java.util.Scanner;

public class Last_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int m=sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println(lastIndex(arr,arr.length-1,m));
    }
   public static int lastIndex(int[]arr,int i,int m){
        if (i<0){
            return -1;
        }
        if (arr[i]==m){
            return i;
        }
        return lastIndex(arr,i-1,m);
   }
}
