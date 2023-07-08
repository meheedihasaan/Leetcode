/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contest;

/**
 *
 * @author Acer
 */
public class MinimumNumberOfTrainingToWinAcompetition {
    
    public static int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int exHour = 0;
        int y = initialExperience;
        int totalEnergy = 0;
        for (int i = 0; i < energy.length; i++) {
            totalEnergy+=energy[i];
            
            if(y <= experience[i]){
                exHour+=(experience[i]+1-y);
                y+=exHour;
            }
            y+=experience[i];
        }
        
        int enHour = Math.max(0, totalEnergy+1 - initialEnergy);
        int ans = enHour+exHour;
        return ans;
    }
    
    public static void main(String[] args) {
        int x = 44;
        int y = 67;
        int energy[] = {43,57,82,32,48,5,82,84,19,89,23,89,88,13};
        int experience[] = {67,9,23,47,61,19,9,90,37,87,76,81,59,57};
        System.out.println(minNumberOfHours(x,y,energy,experience));
    }
    
}
