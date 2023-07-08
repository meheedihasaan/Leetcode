/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author Acer
 */

public class Day20_KthLargestElementInArray {
    
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
    
}
