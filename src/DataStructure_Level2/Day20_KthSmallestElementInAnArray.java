/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.PriorityQueue;

/**
 *
 * @author Acer
 */
public class Day20_KthSmallestElementInAnArray {
    
    public static int kthSmallest(int nums[], int k){
        int n = nums.length;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            minHeap.add(nums[i]);
        }
        
        for (int i = 0; i < k-1; i++) {
            minHeap.poll();
        }
        return minHeap.peek();
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,2,4,5,2,3,4,7};
        System.out.println(kthSmallest(nums, 4));
    }
    
}
