package Lecture_16;

public class Maze_Path {
    public static void main(String[] args) {
        int n=3;
        int m=3;
        Path(0,0,n-1,m-1,"");

    }
    //cr->currenr row,cc->current column,er->end row,ec->end column,
    public static  void Path(int cr,int cc,int er,int ec,String ans){
        if (cr==er && cc==ec){
            System.out.println(ans);
            return;
        }
        if (cr>er ||cc>ec){
            return;
        }
        Path(cr,cc+1,er,ec,ans+"H");
        Path(cr+1,cc,er,ec,ans+"V");


    }
}
