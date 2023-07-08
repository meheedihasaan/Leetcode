/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BFS_And_DFS;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/number-of-enclaves/

public class NumberOfEnclaves {
    public int cnt = 0;
    public int numEnclaves(int[][] grid) {
        //Time Complexity: O(n*m), Space Complexity: O(n*m)
        int ans = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    cnt = 0;
                    if(dfs(i, j, grid)){
                        ans+=cnt;
                    }
                }
            }
        }
        return ans;
    }
    
    public boolean dfs(int i, int j, int[][] grid){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length){
            return false;
        }
        
        if(grid[i][j] == 0){
            return true;
        }
        
        grid[i][j] = 0;
        cnt++;
        
        boolean A = dfs(i, j+1, grid);
        boolean B = dfs(i, j-1, grid);
        boolean C = dfs(i+1, j, grid);
        boolean D = dfs(i-1, j, grid);
        
        return A && B && C && D;
    }
}
