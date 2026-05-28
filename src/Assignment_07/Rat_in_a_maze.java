package Assignment_07;

import java.util.Scanner;

public class Rat_in_a_maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr =  new int[n][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printUniquePaths(arr, 0, 0, "");
        if(val == false ){
            System.out.println("");
        }


    }
    // static variable for check empty string--
    static boolean val =  false;
    public static void printUniquePaths(int[][] arr, int cc , int cr, String res){
        // base case-- outer range -
        if(cc < 0 || cr < 0 || cc >= arr[0].length || cr >= arr.length || arr[cr][cc] == 0){
            return;
        }

        // base case to print answer
        if(cr == arr.length-1  && cc == arr[0].length-1){
            val = true;
            System.out.print(res + " ");
            return;
        }

        // recursive call four direction--
        arr[cr][cc] = 0;
        printUniquePaths(arr, cc, cr+1, res+'D'); //down
        printUniquePaths(arr, cc-1, cr, res+'L'); //  left
        printUniquePaths(arr, cc+1, cr, res+'R'); //right
        printUniquePaths(arr, cc, cr-1, res+'U'); //down
        arr[cr][cc] = 1;
    }
}
