/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BFS_And_DFS;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/flood-fill/

public class FloodFill {
    //Time Complexity: O(m*n), Space Complexity: O(m*n)
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        dfs(sr, sc, color, image, image[sr][sc]);
        return image;
    }
    
    public void dfs(int i, int j, int color, int[][] image, int start){
        //If index is out of bound then stop
        if(i < 0 || i >= image.length || j < 0 || j >= image[0].length){
            return;
        }
        
        //If current cell is not as starting cell then stop
        if(image[i][j] != start){
            return;
        }
        
        //If current cell is already colored then return
        if(image[i][j] == color){
            return;
        }
        
        //Color the current cell
        image[i][j] = color;
        
        //Recursive call for four directional neighbouring cells
        dfs(i, j+1, color, image, start);
        dfs(i, j-1, color, image, start);
        dfs(i+1, j, color, image, start);
        dfs(i-1, j, color, image, start);
    }
}
