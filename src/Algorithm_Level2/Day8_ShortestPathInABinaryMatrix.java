/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class Day8_ShortestPathInABinaryMatrix {
    
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0 || grid[n-1][n-1] != 0){
            return -1;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        queue.offer(new Pair(0, 0));
        int count = 0;
        while(!queue.isEmpty()){
            //Increase count by 1 when we move to one level to another level
            count++;
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Pair temp = queue.poll();
                int row = temp.row;
                int col = temp.col;
                
                //If we reach at bottom-right cell then we get the path.
                if(row == n-1 && col == n-1){
                    return count;
                }
                
                //Check every 8-directional cell. If it is zero then add to queue and update it as 1
                
                int directions[][] = {{row, col+1},{row, col-1},{row+1, col},{row-1, col}, {row+1, col+1}, {row-1, col-1}, {row+1, col-1}, {row-1, col+1}};
                for(int direction[] : directions){
                    int r = direction[0];
                    int c = direction[1];
                    if(isValid(r, c, n) && grid[r][c] == 0){
                        queue.offer(new Pair(r, c));
                        grid[r][c] = 1;
                    }
                }
                
//                 if(isValid(row, col+1, n) && grid[row][col+1] == 0){
//                     queue.offer(new Pair(row, col+1));
//                     grid[row][col+1] = 1;
//                 }
                
//                 if(isValid(row, col-1, n) && grid[row][col-1] == 0){
//                     queue.offer(new Pair(row, col-1));
//                     grid[row][col-1] = 1;
//                 }
                
//                 if(isValid(row+1, col, n) && grid[row+1][col] == 0){
//                     queue.offer(new Pair(row+1, col));
//                     grid[row+1][col] = 1;
//                 }
                
//                 if(isValid(row-1, col, n) && grid[row-1][col] == 0){
//                     queue.offer(new Pair(row-1, col));
//                     grid[row-1][col] = 1;
//                 }
                
//                 if(isValid(row+1, col+1, n) && grid[row+1][col+1] == 0){
//                     queue.offer(new Pair(row+1, col+1));
//                     grid[row+1][col+1] = 1;
//                 }
                
//                 if(isValid(row-1, col-1, n) && grid[row-1][col-1] == 0){
//                     queue.offer(new Pair(row-1, col-1));
//                     grid[row-1][col-1] = 1;
//                 }
                
//                 if(isValid(row+1, col-1, n) && grid[row+1][col-1] == 0){
//                     queue.offer(new Pair(row+1, col-1));
//                     grid[row+1][col-1] = 1;
//                 }
                
//                 if(isValid(row-1, col+1, n) && grid[row-1][col+1] == 0){
//                     queue.offer(new Pair(row-1, col+1));
//                     grid[row-1][col+1] = 1;
//                 }
            }
        }
        //If no path found then return -1
        return -1;
    }
    
    public boolean isValid(int i, int j, int n){
        return !(i < 0 || i >= n || j < 0 || j >= n);
    }
    
}
