/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Day8_AllPathFromSourchToTarget {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        //The graph is not cyclic. So, no need to use visited array.
        dfs(0, graph, ans, list);
        return ans;
    }
    
    public void dfs(int i, int[][] graph, List<List<Integer>> ans, List<Integer> list){
        list.add(i);
        if(i == graph.length-1){
            ans.add(new ArrayList(list));
            return;
        }
        
        for(int j = 0; j < graph[i].length; j++){
            dfs(graph[i][j], graph, ans, list);
            
            //Backtracking
            list.remove(list.size()-1);
        }
    } 
    
}
