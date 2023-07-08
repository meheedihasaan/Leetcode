/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */
public class Day4_ContainerWithMostWater {
    
    public static int mostWater(int height[]){
        int ans = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length-1;
        while(left < right){
            int x = (right-left)*(Math.min(height[left], height[right]));
            ans = Math.max(ans, x);
            
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }
    
}
