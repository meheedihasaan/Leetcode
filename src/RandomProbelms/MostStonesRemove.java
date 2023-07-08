/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomProbelms;

import java.util.HashMap;

/**
 *
 * @author User
 */
public class MostStonesRemove {
    public int removeStones(int[][] stones) {
        HashMap<Integer, Integer> rowMap = new HashMap<>();
        HashMap<Integer, Integer> colMap = new HashMap<>();
        for(int arr[] : stones){
            int row = arr[0];
            int col = arr[1];
            
            rowMap.put(row, rowMap.getOrDefault(row, 0)+1);
            colMap.put(col, colMap.getOrDefault(col, 0)+1);
        }
        
        int cnt = 0;
        for(int arr[] : stones){
            int row = arr[0];
            int col = arr[1];
            
            if(rowMap.containsKey(row) && colMap.containsKey(col)){
                if(rowMap.get(row) >= 2 && colMap.containsKey(col)){
                    cnt++;
                    rowMap.put(row, rowMap.get(row)-1);
                    colMap.put(col, colMap.get(col)-1);
                }
                else if(colMap.get(col) >= 2 && rowMap.containsKey(col)){
                    cnt++;
                    rowMap.put(row, rowMap.get(row)-1);
                    colMap.put(col, colMap.get(col)-1);
                }
            }
        }
        return cnt;
    }
    
    public static void main(String[] args) {
        MostStonesRemove ms = new MostStonesRemove();
        int stones[][] = {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}};
        System.out.println(ms.removeStones(stones));
    }
}
