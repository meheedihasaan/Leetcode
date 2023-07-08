/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day15_LastStoneWeight_1046 {
    
    public static int lastStoneWeight(int stones[]){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        
        while(list.size() > 1){
            Collections.sort(list, Collections.reverseOrder());
            int x = list.get(0);
            int y = list.get(1);
            if(x == y){
                list.remove(0);
                list.remove(0);
            }
            else{
                list.set(0, x-y);
                list.remove(1);
            }
        }
        
        if(list.isEmpty()){
            return 0;
        }
        return list.get(0);
    }
    
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(lastStoneWeight(arr));
    }
    
}
