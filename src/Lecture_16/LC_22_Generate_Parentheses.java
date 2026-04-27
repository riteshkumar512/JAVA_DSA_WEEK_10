package Lecture_16;

import java.util.ArrayList;
import java.util.List;

public class LC_22_Generate_Parentheses {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        Parenthesis(0,0,n,"",ll);
        System.out.println(ll);

    }
    public static void Parenthesis(int open,int closed,int n,String ans,List<String>ll){
        if (open==n && closed==n){
//            System.out.println(ans);
            ll.add(ans);
            return;
        }
        if (open>n || closed>open){
            return;
        }

        Parenthesis(open+1,closed,n,ans+"(",ll);
        Parenthesis(open,closed+1,n,ans+")",ll);
    }
}
