/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

import java.util.HashSet;

/**
 *
 * @author Acer
 */
public class Day5_ValidSudoku_36 {
    
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        
        //Check 3*3 Box Duplicate value
        for(int i = 0; i < 9; i+=3){
            for(int j = 0; j < 9; j+=3){
                for(int p = 0; p < 3; p++){
                    for(int q = 0; q < 3; q++){
                        char c = board[i+p][j+q];
                        if(set.contains(c)){
                            return false;
                        }
                        
                        if(Character.isDigit(c)){
                            set.add(c);
                        }
                    }
                }
                set.clear();
            }
        }
        
        //Check Duplicate in Row-wise
        set.clear();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[i][j];
                if(set.contains(c)){
                    return false;
                }
                
                if(Character.isDigit(c)){
                    set.add(c);
                }
            }
            set.clear();
        }
        
        //Check Duplicate in Column-wise
        set.clear();
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                char c = board[j][i];
                if(set.contains(c)){
                    return false;
                }
                
                if(Character.isDigit(c)){
                    set.add(c);
                }
            }
            set.clear();
        }
        return true;  
    }
    
}
