/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class FloodFill_Day7 {
    
    int m = 0;
    int n = 0;
    public int[][] floodFill(int image[][], int sr, int sc, int color){
        m = image.length;
        n = image[0].length;
        flood(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    
    public void flood(int[][] image, int sr, int sc, int color, int prev){
        if(sr < 0 || sr >= m || sc < 0 || sc >= n){
            return;
        }
        
        if(image[sr][sc] != prev){
            return;
        }
        
        if(image[sr][sc] == color){
            return;
        }
        
        image[sr][sc] = color;
        
        flood(image, sr, sc+1, color, prev);
        flood(image, sr, sc-1, color, prev);
        flood(image, sr+1, sc, color, prev);
        flood(image, sr-1, sc, color, prev);
    }
    
    public static void main(String[] args) {
        int image[][] = {{1,1,1},{1,1,0},{1,0,1}};
        
        FloodFill_Day7 f = new FloodFill_Day7();
        int ans[][] = f.floodFill(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
