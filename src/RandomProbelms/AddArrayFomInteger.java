/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author User
 */
public class AddArrayFomInteger {
    public static String addToArrayForm(int[] num, int k) {
        String a = Arrays.toString(num);
        String b = String.valueOf(k);
        if(a.length() < b.length()){
            String temp = a;
            a = b;
            b = temp;
        }

        List<Integer> ans = new ArrayList<>();
        int i = a.length()-1, j = b.length()-1;
        int c = 0;
        while(j >= 0){
            int val = Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(j))+c;
            if(val>= 10){
                val-=10;
                c = 1;
            }
            else{
                c = 0;
            }
            ans.add(val);
            i--;
            j--;
        }

        while(i >= 0){
            int val = Character.getNumericValue(a.charAt(i))+c;
            if(val>= 10){
                val-=10;
                c = 1;
            }
            else{
                c = 0;
            }
            ans.add(val);
            i--;
        }

        if(c == 1){
            ans.add(c);
        }

        List<Integer> list = new ArrayList<>();
        for(int m = ans.size()-1; m >= 0; m--){
            list.add(ans.get(m));
        }
        return a;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,0,0};
        int k = 45;
        System.out.println(addToArrayForm(arr, k));
    }
}
