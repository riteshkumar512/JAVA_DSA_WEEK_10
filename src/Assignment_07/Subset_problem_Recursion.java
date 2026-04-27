package Assignment_07;

import java.util.Scanner;

public class Subset_problem_Recursion {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        arraySubset( arr,0,target,0,"");
        System.out.println();
        System.out.print(count);

    }
    public static void arraySubset(int []arr,int i ,int targert,int sum ,String ans){
        if (i==arr.length){
            if (sum==targert){
                count++;
                System.out.print(ans+"  ");
            }
            return ;
        }
        arraySubset(arr,i+1,targert,sum+arr[i],ans+arr[i]+" ");
        arraySubset(arr,i+1,targert,sum,ans);
    }
}
