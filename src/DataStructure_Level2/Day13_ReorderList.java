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
public class Day13_ReorderList {
    
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
    
    public void reorderList(ListNode head){
        ListNode slow = head;
        ListNode first = head;
        while(first != null && first.next != null){
            slow = slow.next;
            first = first.next.next;
        }
        
        ListNode mid = slow.next;
        slow.next = null;
        
        //Reverse LinkedList from mid to end                
        ListNode node1 = head;
        ListNode node2 = reverse(mid);
        
        while(node2 != null){
            ListNode n1 = node1.next;
            ListNode n2 = node2.next;
            
            node1.next = node2;
            node2.next = n1;
            
            node1 = n1;
            node2 = n2;
        }
    }
    
    public ListNode reverse(ListNode head){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
}
