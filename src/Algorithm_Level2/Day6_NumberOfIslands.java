/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */
public class Day6_NumberOfIslands {
    
    public static int numberOfIslands(int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(grid[i][j] == 1){
                    island(grid, i, j, n, m);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    
    public static void island(int[][] grid, int i, int j, int n, int m){
        //Check index is out of bound or not
        if(i < 0 || j < 0 || i >= n || j >= m){
            return;
        }
        
        //If water found
        if(grid[i][j] == 0){
            return;
        }
        
        //If land then set is 0
        if(grid[i][j] == 1){
            grid[i][j] = 0;
        }
        
        //Recursive call for 4 diagonal cell
        island(grid, i, j+1, n, m);
        island(grid, i, j-1, n, m);
        island(grid, i+1, j, n, m);
        island(grid, i-1, j, n, m);
    }
    
    public static void main(String[] args) {
        int[][] grid = {{1,1,0},{1,1,0},{0,0,1},{0,0,0}};
        System.out.println(numberOfIslands(grid));
    }
    
}
