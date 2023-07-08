/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomProbelms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author User
 */
public class RandomizedSet {
    List<Integer> list;
    Random random;
    public RandomizedSet() {
        list = new ArrayList<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!list.contains(val)){
            list.add(val);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        return list.remove(Integer.valueOf(val));
    }
    
    public int getRandom() {
        int index = random.nextInt(list.size());
        return list.get(index);
    }
}
