package Assignment_07;

import java.util.Arrays;
import java.util.Scanner;

public class DictionaryOrder_Smaller {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        String sorted=new String(arr);
        Lexiorder(sorted,"",str);
    }
    public static void Lexiorder(String ques,String ans,String original){
        if (ques.length()==0){
            if (ans.compareTo(original) < 0){
                System.out.println(ans);
            }
            return;
        }

        for (int i = 0; i < ques.length(); i++) {
            char ch=ques.charAt(i);
            String s1=ques.substring(0,i);
            String s2=ques.substring(i+1);
            Lexiorder(s1+s2,ans+ch,original);

        }

    }
}
