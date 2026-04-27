package Assignment_07;

import java.util.Scanner;

public class Mazepath_D2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        Path(0,0,N-1,N-1,"");
        System.out.println();
        System.out.println(CountPath(0,0,N-1,N-1,""));

    }
    //cr->currenr row,cc->current column,er->end row,ec->end column,
    public static  void Path(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.print(ans+" ");
            return;
        }
        if (cr>er ||cc>ec){
            return;
        }
        Path(cr+1,cc,er,ec,ans+"V");
        Path(cr,cc+1,er,ec,ans+"H");
        if (cc==cr){
            Path(cr+1,cc+1,er,ec,ans+"D");
        }



    }
    public static  int  CountPath(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
//            System.out.println(ans);
            return 1;
        }
        if (cr>er || cc>ec){
            return 0 ;
        }
        int z=0;
        int x= CountPath(cr,cc+1,er,ec,ans+"H");
        int y= CountPath(cr+1,cc,er,ec,ans+"V");
        if (cc==cr){
           z= CountPath(cr + 1, cc + 1, er, ec, ans + "D");
        }

        return x+y+z;
    }
}
