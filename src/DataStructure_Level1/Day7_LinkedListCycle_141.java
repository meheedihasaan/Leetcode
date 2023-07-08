/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataStructure_Level1;

/**
 *
 * @author Acer
 */
public class Day7_LinkedListCycle_141 {
    
    class ListNode{
        int data;
        ListNode next;
        ListNode(){
            
        }
        ListNode(int data){
            this.data = data;
        }
        ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    
    public boolean hasCycle(ListNode head) {
        //If head is null then return false
        if(head == null){
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;  //Move Forward by 1
            fast = fast.next.next;  //Move Forward by 2
            if(slow == fast){
                return true; //If sow and fast visits, then cycle is found
            }
        }
        
        //If Cycle is not found then return false
        return false;
    }
    
}
