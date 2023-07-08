/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day4_IntervalListIntersection {
    
    public static int[][] intersection(int[][] first, int[][] second){
        List<int[]> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < first.length && j < second.length){
            int max = Math.max(first[i][0], second[j][0]);
            int min = Math.min(first[i][1], second[j][1]);
            if(max <= min){
                list.add(new int[]{max, min});
            }
            
            if(second[j][1] > first[i][1]){
                i++;
            }
            else{
                j++;
            }
        }
        
        int ans[][] = new int[list.size()][2];
        for (int k = 0; k < list.size(); k++) {
            ans[k][0] = list.get(k)[0];
            ans[k][1] = list.get(k)[1];
        }
        return ans;
    }
    
}
