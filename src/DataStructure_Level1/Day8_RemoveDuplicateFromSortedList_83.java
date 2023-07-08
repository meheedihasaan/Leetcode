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
public class Day8_RemoveDuplicateFromSortedList_83 {
    
    static class ListNode{
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
    
    public static ListNode deleteDuplicates(ListNode head){
        if(head == null){
            return head;
        }
        
        ListNode ans = new ListNode(0);
        ListNode ansHead = ans;
        ListNode prev = head;
        while(head.next != null){
            head = head.next;
            if(prev.val != head.val){
                ans.next = prev;
                ans = ans.next;
            }
            prev = prev.next;
        }
        ans.next = head; //If List has one element 
        return ansHead.next;       
    }
    
}
