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
public class MinimumTimeToMakeRopeColorful {
    
    public static int minCost(String colors, int[] neededTime) {
        int time = 0;
        int i = 0;
        while(i < colors.length()-1){
            int max = 0;
            if(colors.charAt(i) == colors.charAt(i+1)){
                max = neededTime[i];
                time+=neededTime[i];
                while(i < colors.length()-1 && colors.charAt(i) == colors.charAt(i+1)){
                    max = Math.max(max, neededTime[i+1]);
                    time+=neededTime[i+1];
                    i++;
                }
                time-=max;
            }
            else{
                i++;
            }
        }
        return time;
    }
    
    public static void main(String[] args) {
        String colors = "abaac";
        int neededTime[] = {1,2,3,4,5};
        System.out.println(minCost(colors, neededTime));
    }
    
}
