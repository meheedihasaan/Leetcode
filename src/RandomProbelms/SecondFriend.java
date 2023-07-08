/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class SecondFriend {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        k:
        for (int t = 1; t <= T; t++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            char grid[][] = new char[r][c];
            for (int i = 0; i < r; i++) {
                grid[i] = sc.next().toCharArray();
            }
            
            boolean hasTree = false;
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(grid[i][j] == '^'){
                        hasTree = true;
                        break;
                    }
                }
            }
            
            if(r == 1 || c == 1){
                if(hasTree){
                    System.out.println("Case #"+t+": Impossible");
                    continue;
                }
            }
            
            
            System.out.println("Case #"+t+": Possible");
            StringBuilder str = new StringBuilder();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if(hasTree){
                        grid[i][j] = '^';
                    }
                    str.append(grid[i][j]);
                }
                if(i < r-1){
                    str.append("\n");
                }
            }
            System.out.println(str.toString());
            
        }
    }
    
}
