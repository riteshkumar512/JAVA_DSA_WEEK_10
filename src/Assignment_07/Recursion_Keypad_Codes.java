package Assignment_07;

import java.util.Scanner;

public class Recursion_Keypad_Codes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println("\n"+PrintCombination(str,"",0));

    }
    static String[] key={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static int PrintCombination(String ques,String ans,int count){
        if (ques.length()==0){
            System.out.print(ans+" ");
            return count +1;
        }
        char ch=ques.charAt(0);
        String str=key[ch-'0'];
        for (int i = 0; i < str.length(); i++) {
            count= PrintCombination(ques.substring(1),ans+str.charAt(i),count);
        }
        return count;
    }
}
