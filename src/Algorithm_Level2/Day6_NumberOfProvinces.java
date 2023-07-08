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
public class Day6_NumberOfProvinces {
    
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(visited[i] == false){
                count++;
                dfs(i, isConnected, visited);
            }
        } 
        return count;
    }
    
    public void dfs(int i, int[][] isConnected, boolean[] visited){
        if(visited[i] == true){
            return;
        }
        
        visited[i] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if(isConnected[i][j] == 1 && i != j){
                dfs(j, isConnected, visited);
            }
        }
    }
    
}
