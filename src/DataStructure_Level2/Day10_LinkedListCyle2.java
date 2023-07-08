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
public class Day10_LinkedListCyle2 {
    
    class ListNode{
        int val;
        ListNode next;
        ListNode(){
            
        }
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    
    public ListNode detectCycle(ListNode head) {
        ListNode p = head;
        ListNode q = head;
        boolean hasCycle = false;
        while(q != null && q.next != null){
            p = p.next;              //Move p forward by one
            q = q.next.next;         //Move q forward by two
            if(p == q){
                hasCycle = true;     //If p visits q, then there is a cycle
                break;
            }
        }
        
        if(!hasCycle){
            return null;            //If there is no cycle, retur null
        }
        
        p = head;
        while(p != q){
            p = p.next;            //Move Forward by one
            q = q.next;            //Move Forward by one
        }
        return p;
    }
    
}
