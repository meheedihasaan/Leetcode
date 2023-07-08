/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day19_MinimumNumberOfVerticesToReachAllNodes {
    
    public static List<Integer> minimumVertices(int n, List<List<Integer>> edges){
        int arr[] = new int[n];
        for (int i = 0; i < edges.size(); i++) {
            List<Integer> edge = edges.get(i);
            int x = edge.get(i);
            arr[x] = 1;
        }
        
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if(arr[i] == 0){
                ans.add(i);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        
    }
    
}
