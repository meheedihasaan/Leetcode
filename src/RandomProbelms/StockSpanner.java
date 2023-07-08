/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RandomProbelms;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author User
 */
public class StockSpanner {
    PriorityQueue<Integer> minHeap;
    public StockSpanner() {
        minHeap = new PriorityQueue<>((a, b)-> a-b);
    }
    
    public int next(int price) {
        minHeap.add(price);
        int ans = 0;
        Iterator<Integer> it = minHeap.iterator();
        while(it.hasNext()){
            ans++;
            int n = (int)it.next();
            if(n == price){
                break;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        StockSpanner st = new StockSpanner();
        System.out.println(st.next(100));
        System.out.println(st.next(80));
        System.out.println(st.next(60));
        System.out.println(st.next(70));
        System.out.println(st.next(60));
        System.out.println(st.next(75));
    }
}
