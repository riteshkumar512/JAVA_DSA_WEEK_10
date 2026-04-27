package Assignment_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Replace_all_pi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        List<String> str=new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            str.add(sc.next());
        }

        for (String name: str){
            System.out.println(replacePi(name));
        }

    }
    public static String replacePi(String str){
        if (str.length() <= 1){
            return str;
        }
        if (str.substring(0,2).equals("pi")){
            return 3.14 + replacePi(str.substring(2));
        }
        return str.charAt(0) + replacePi(str.substring(1));


    }
}
