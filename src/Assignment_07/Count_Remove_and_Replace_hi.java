package Assignment_07;

import java.util.Scanner;

public class Count_Remove_and_Replace_hi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=CountprintStr(s);
        System.out.println(count);
        System.out.println(remove_hi(s));
        System.out.println(replace_hi(s));
    }
    public static String remove_hi(String str){
        if (str.length()==0){
            return "";
        }
        if ( str.length()>=2  && str.substring(0,2).equals("hi")){
             return remove_hi(str.substring(2));
        }else{
          return str.charAt(0) + remove_hi(str.substring(1));
        }

    }
    public static String replace_hi(String str){
            if (str.length()==0){
            return "" ;
        }
        if ( str.length()>=2  && str.substring(0,2).equals("hi")){
            return "bye" + replace_hi(str.substring(2));
        }else{
            return str.charAt(0) + replace_hi(str.substring(1));
        }
    }
    public static int CountprintStr(String str){
        if (str.length()==0){
            return 0;
        }
        if ( str.length()>=2  && str.substring(0,2).equals("hi")){
            return 1+ CountprintStr(str.substring(2));
        }else{
            return CountprintStr(str.substring(1));
        }
    }

}
