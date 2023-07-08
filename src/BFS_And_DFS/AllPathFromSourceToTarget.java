/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BFS_And_DFS;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/all-paths-from-source-to-target/

public class AllPathFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
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
