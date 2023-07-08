/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Arrays;
import java.util.HashMap;


/**
 *
 * @author Acer
 */
public class SortThePeople {
    
    public static String[] sortPeople(String[] names, int[] heights){
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        int i = 0;
        int j = heights.length-1;
        while(i < heights.length && j >= 0){
            names[i] = map.get(heights[j]);
            i++;
            j--;
        }
        return names;
    }
    
    public static void main(String[] args) {
        String names[] = {"Mary","John","Marry"};
        int heights[] = {180,165,170};
        String ans[] = sortPeople(names, heights);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    
}
