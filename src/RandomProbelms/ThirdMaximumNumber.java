/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

/**
 *
 * @author Acer
 */
public class ThirdMaximumNumber {
    
    public static int thirdMaximum(int nums[]){
        //HashMap Solution
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i < nums.length; i++){
//            if(map.containsKey(nums[i])){
//                map.put(nums[i], map.get(nums[i])+1);
//            }
//            else{
//                map.put(nums[i], 1);
//            }
//        }
//        
//        List<Integer> list = new ArrayList<>(map.keySet());
//        Collections.sort(list, Collections.reverseOrder());
//        //return list.size();
//        if(list.size() <= 2){
//            return list.get(0);
//        }
//        
//        return list.get(2);
        
        //MinHeap Solution
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int x : set) {
            minHeap.add(x);
            if(minHeap.size() > 3){
                minHeap.poll();
            }
        }
        
        if(minHeap.size() == 1){
            return minHeap.peek();
        }
        
        if(minHeap.size() == 2){
            minHeap.poll();
            return minHeap.peek();
        }
        
        return minHeap.peek();
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,3,4,4,5};
        System.out.println(thirdMaximum(nums));
    }
    
}
