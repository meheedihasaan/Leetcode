/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Day16_NumberOfLongestSubsequence {
    
    public static int findNumberOfLIS(int[] nums) {
        int n = nums.length;
        int length[] = new int[n];
        int count[] = new int[n];
        Arrays.fill(length, 1);
        Arrays.fill(count, 1);
        
        int max = 1;
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i] && length[j]+1 > length[i]){
                    length[i] = length[j]+1;
                    count[i] = count[j];
                }
                else if(nums[j] < nums[i] && length[j]+1 == length[i]){
                    count[i]+=count[j];
                }
            }
            max = Math.max(length[i], max);
        }
        
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(length[i] == max){
                ans+=count[i];
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {1,3,5,4,7};
        System.out.println(findNumberOfLIS(nums));
    }
    
}
