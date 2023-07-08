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
public class Day2_DesignHashMap {
    
    public int arr[] = new int[1000001];
    class HashMap{
        
        public HashMap(){
            for (int i = 0; i < 1000001; i++) {
                arr[i] = -1;
            }
        }
        
        public void put(int key, int value){
            arr[key] = value;
        }
        
        public int get(int key){
            return arr[key];
        }
        
        public void remove(int key){
            arr[key] = -1;
        }
        
    }
    
}
