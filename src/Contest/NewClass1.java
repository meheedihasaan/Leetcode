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
public class NewClass1 {
    
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n-2][n-2];
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < n-2; j++) {
                int x = 0;
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        x = Math.max(x, grid[k][l]);
                    }
                }
                ans[i][j] = x;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[][] grid = {{1,1,1,1,1},{1,1,1,1,1},{1,1,2,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        int[][] ans = largestLocal(grid);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
