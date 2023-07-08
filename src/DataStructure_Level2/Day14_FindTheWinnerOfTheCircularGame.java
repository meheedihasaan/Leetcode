/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Day14_FindTheWinnerOfTheCircularGame {
    
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }
        
        int i = 0;
        while(list.size() > 1){
            i = i+k-1;
            i = i%list.size();
            list.remove(i);
        }
        
        return list.get(0);
    }
    
    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
    
}
