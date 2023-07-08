/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

/**
 *
 * @author Acer
 */
public class Day3_SpiralMatrix {
    
    public static int[][] spiralMatrix(int n){
        int ans[][] = new int[n][n];
        int top = 0;
        int right = n-1;
        int bottom = n-1;
        int left = 0;
        int num = 1;
        while(left <= right && top <= bottom){
            //Fill The Top Most Row
            for (int i = left; i <= right; i++) {
                ans[top][i] = num;
                num++;
            }
            top++;
            
            //Fill The Right Most Column
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = num;
                num++;
            }
            right--;
            
            //Fill The Bottom Most Row
            for (int i = right; i >= left; i--) {
                ans[bottom][i] = num;
                num++;
            }
            bottom--;
            
            //Fill The Left Most column
            for (int i = bottom; i >= top; i--) {
                ans[i][left] = num;
                num++;
            }
            left++;
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int ans[][] = spiralMatrix(3);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
