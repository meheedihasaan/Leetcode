/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class Day9_FloodFill_733 {
    
    public static void floodFill(int arr[][], int sr, int sc, int color, int starting){
        int n = arr.length;     //Row size
        int m = arr[0].length;  //Column size
        
        //If any of indexes out of bound
        if(sr < 0 || sc < 0 || sr >= n || sc >= m){
            return;
        }
        
        //If cell is already colored with color
        if(arr[sr][sc] == color){
            return;
        }
        
        //If cell color not mathches with the previous/starting color
        if(arr[sr][sc] != starting){
            return;
        }
        
        //If matches
        arr[sr][sc] = color;
        
        floodFill(arr, sr, sc+1, color, starting);
        floodFill(arr, sr+1, sc, color, starting);
        floodFill(arr, sr-1, sc, color, starting);
        floodFill(arr, sr, sc-1, color, starting);
    }
    
    public static void main(String[] args) {
        int arr[][] = {{0,0,0},{0,0,0}};
        int sr = 1;
        int sc = 1;
        int color = 0;
        int starting = arr[sr][sc];
        floodFill(arr,sr,sc,color,starting);
        //System.out.println(arr.length+" "+arr[0].length);
        //System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
