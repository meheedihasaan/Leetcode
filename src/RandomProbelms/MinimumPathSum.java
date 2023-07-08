/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class MinimumPathSum {
    
    public static int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = n-1; i >= 0; i--){
            for(int j = m-1; j >= 0; j--){
                if(i == n-1 || j == m-1){
                    if(i == n-1 && j == m-1){
                        grid[i][j] = grid[i][j];
                    }
                    else{
                        if(i == n-1){
                            grid[i][j] = grid[i][j] + grid[i][j+1];
                        }
                        
                        if(j == m-1){
                            grid[i][j] = grid[i][j] + grid[i+1][j];
                        }
                    }                    
                }
                else{
                    grid[i][j] = grid[i][j] + Math.min(grid[i][j+1], grid[i+1][j]);
                }
            }
        }
        return grid[0][0];
    }
    
    public static void main(String[] args) {
        int nums[][] = {{1,2,3},{9,4,6},{9,0,2}};
        System.out.println(minPathSum(nums));
    }
    
}
