/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day5_ProductOfArrayExceptSelf {
    
    public static int[] product(int nums[]){
        int n = nums.length;
        int zero = 0;
        long product = 1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zero++;
            }
            else{
                product*=nums[i];
            }
        }
        
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                if(zero == 0){
                    ans[i] = (int)(product/nums[i]);
                }
                else{
                    ans[i] = 0;
                }
            }
            else{
                if(zero > 1){
                    ans[i] = 0;
                }
                else{
                    ans[i] = (int)product;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int nums[] = {-1,1,0,-3,3};
        int ans[] = product(nums);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
