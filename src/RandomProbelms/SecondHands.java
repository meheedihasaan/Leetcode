/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SecondHands {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        k:
        for(int t = 1; t <= T; t++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            int freq[] = new int[101];
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                set.add(a);
                freq[a]++;
            }
            
            if(n < k){
                System.out.println("Case #"+t+": NO");
            }
            else if(n > 2*k){
                System.out.println("Case #"+t+": NO");
            }
            else if(n == k){
                for (int x : set) {
                    if(freq[x] >= 2){
                        System.out.println("Case #"+t+": NO");
                        continue k;
                    }
                }
                System.out.println("Case #"+t+": YES");
            }
            else if(n > k){
                int cnt = 0;
                for (int x : set) {
                    if(freq[x] > 2){
                        System.out.println("Case #"+t+": NO");
                        continue k;
                    }
                    
                    if(freq[x] == 2){
                        cnt++;
                    }
                }
                //System.out.println(cnt);
                if(cnt <= k){
                    System.out.println("Case #"+t+": YES");
                }
                else{
                    System.out.println("Case #"+t+": NO");
                }
            }
        }
    }
    
}
