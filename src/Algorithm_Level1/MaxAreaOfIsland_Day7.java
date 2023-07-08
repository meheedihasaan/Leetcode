/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class MaxAreaOfIsland_Day7 {
    
    int m = 0;
    int n = 0;
    public int maxAreaOfIsland(int grid[][]){
        m = grid.length;
        n = grid[0].length;
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int length = maxLength(grid, i, j);
                max = Math.max(max, length);
            }
        }
        return max;
    }
    
    int cnt = 0;
    public int maxLength(int[][] grid, int i, int j){
        //If index is out of bound then return 0
        if(i < 0 || i >= m || j < 0 || j >= m){
            return 0;
        }
        
        //If current cell is water then return 0
        if(grid[i][j] == 0){
            return 0;
        }
        
        //If current cell is land then increase the length by 1 and set current land as water
        if(grid[i][j] == 1){
            grid[i][j] = 0;
            cnt = 1;
        }
        
        //Recursive call for 4 diagnal cells
        cnt+=maxLength(grid, i, j+1);
        cnt+=maxLength(grid, i, j-1);
        cnt+=maxLength(grid, i+1, j);
        cnt+=maxLength(grid, i-1, j);
        
        return cnt;
    }
    
    public static void main(String[] args) {
        MaxAreaOfIsland_Day7 m = new MaxAreaOfIsland_Day7();
        int grid[][] = {{1,1,0,1},{1,1,0,1},{1,0,1,1},{1,1,0,0}};
        System.out.println(m.maxAreaOfIsland(grid));
    }
    
}
