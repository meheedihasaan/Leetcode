/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Acer
 */
public class Day14_MinStack {
    
    List<Integer> list;
    
    Day14_MinStack(){
        list = new ArrayList<>();
    }
    
    public void push(int val){
        list.add(val);
    }
    
    public void pop(){
        list.remove(list.size()-1);
    }
    
    public int top(){
        return list.get(list.size()-1);
    }
    
    public int getMin(){
        return Collections.min(list);
    }
    
}
