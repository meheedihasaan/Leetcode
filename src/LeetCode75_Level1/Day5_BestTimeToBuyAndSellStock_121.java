/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */
public class Day5_BestTimeToBuyAndSellStock_121 {
      
    //Normal Approch
    public static int maxProfit(int[] prices) {
        if(prices.length == 1){
            return 0;
        }
        
        int minPrice = prices[0];
        int maxDiff = prices[1]-prices[0];
        for (int i = 1; i < prices.length; i++) {
//            if(prices[i]-minPrice > maxDiff){
//                maxDiff = prices[i]-minPrice;
//            }            
//            
//            if(prices[i] < minPrice){
//                minPrice = prices[i];
//            }   
            maxDiff = Math.max(maxDiff, prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return Math.max(0, maxDiff);
    }
    
    public static int MaxProfit(int[] prices){
        int n = prices.length;
        int maxProfit = 0;
        int maxPrice = prices[n-1];
        for (int i = n-2; i >= 0; i--) {
            maxProfit = Math.max(maxProfit, maxPrice-prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
        }
        return maxProfit;
    }
     
    public static void main(String[] args) {
        int arr[] = {7 ,5, 3, 2, 10};
        System.out.println(MaxProfit(arr));
    }
     
}
