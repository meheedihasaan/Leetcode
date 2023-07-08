/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Triangle_Day12 {
    
    public int minimumTotal(List<List<Integer>> triangle){
        int n = triangle.size();
        for(int i = 1; i < n; i++){
            List<Integer> prev = triangle.get(i-1);
            List<Integer> current = triangle.get(i);
            int m = current.size();
            for(int j = 0; j < m; j++){
                if(j == 0){
                    current.set(0, current.get(0) + prev.get(0));
                }
                else if(j == m-1){
                    current.set(j, current.get(j) + prev.get(j-1));
                }
                else{
                    int prevMin = Math.min(prev.get(j), prev.get(j-1));
                    current.set(j, current.get(j) + prevMin);
                }
            }
        }
        
        List<Integer> list = triangle.get(n-1);
        return Collections.min(list);
    }
    
}
