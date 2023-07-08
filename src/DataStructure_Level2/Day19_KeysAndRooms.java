/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Acer
 */
public class Day19_KeysAndRooms {
    
    public boolean canVisitAllRooms(List<List<Integer>> rooms){
        int n = rooms.size();
        boolean visited[] = new boolean[n];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        while(!queue.isEmpty()){
            int i = queue.poll();
            List<Integer> list = rooms.get(i);
            for (int j : list) {
                if(!queue.contains(j) && visited[j] == false){
                    queue.offer(j);
                }
            }
            visited[i] = true;
        }
        
        for (int i = 0; i < n; i++) {
            if(visited[i] == false){
                return false;
            }
        }
        return true;
    }
    
}
