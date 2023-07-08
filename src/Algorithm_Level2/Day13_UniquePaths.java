/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algorithm_Level2;

/**
 *
 * @author User
 */
public class Day13_UniquePaths {
    
    public static int uniquePaths(int m, int n) {
        int grid[][] = new int[m][n];
        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                if(i == m-1 || j == n-1){
                    grid[i][j] = 1;
                }
                else{
                    grid[i][j] = grid[i][j+1] + grid[i+1][j];
                }
            }
        }
        return grid[0][0];
    }
    
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(uniquePaths(m, n));
    }
    
}
