/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day3_BestTimeToBuyAndSellStock_121 {
    
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int maxPrice = prices[n-1];
        int maxProfit = 0;
        for(int i = n-2; i >= 0; i--){
            maxProfit = Math.max(maxProfit, maxPrice-prices[i]);
            maxPrice = Math.max(maxPrice, prices[i]);
        }
        return maxProfit;
    }
    
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    
}
