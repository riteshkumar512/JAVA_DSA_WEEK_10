package Assignment_07;

import java.util.Scanner;

public class Mazepath_D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println("\n"+Path(0,0,N-1,N-1,""));


    }
    //cr->currenr row,cc->current column,er->end row,ec->end column,
    public static  int Path(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.print(ans+" ");
            return 1;
        }
        if (cr>er ||cc>ec){
            return 0;
        }
        int z=0;
        int y= Path(cr+1,cc,er,ec,ans+"V");
        int x= Path(cr,cc+1,er,ec,ans+"H");
        if (cc==cr || cr+cc==ec){
            z= Path(cr + 1, cc + 1, er, ec, ans + "D");
        }

        return x+y+z;


    }
//    public static  int  CountPath(int cr,int cc,int er,int ec,String ans){
//        if (cr==er && cc==ec){
////            System.out.println(ans);
//            return 1;
//        }
//        if (cr>er || cc>ec){
//            return 0 ;
//        }
//        int x= CountPath(cr,cc+1,er,ec,ans+"H");
//        int y= CountPath(cr+1,cc,er,ec,ans+"V");
//        int z=CountPath(cr+1,cc+1,er,ec,ans+"D");
//
//        return x+y+z;
//    }
}
