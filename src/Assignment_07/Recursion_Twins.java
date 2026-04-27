package Assignment_07;

import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(CountTwins(s,0));
    }
    public static int CountTwins(String s,int count){
        if (s.length()==0){
            return count;
        }
        if (s.length()>=3){
            char ch=s.charAt(0);
            char ch2=s.charAt(2);
            if (ch==ch2){
                count= count+1;
            }
        }
        return CountTwins(s.substring(1),count);
    }
}
