/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class ContainerWithMostWater {
    
    public static int mostWater(int height[]){
        int ans = Integer.MIN_VALUE;
        int l = 0; 
        int r = height.length-1;
        while(l < r){
            int x = (r-l)*Math.min(height[l], height[r]);
            ans = Math.max(ans, x);
            
            if(height[l] < height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(mostWater(height));
    }
        
}
