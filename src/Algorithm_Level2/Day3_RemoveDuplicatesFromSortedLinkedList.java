/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level2;

/**
 *
 * @author Acer
 */

public class Day3_RemoveDuplicatesFromSortedLinkedList {
    
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
    
    public ListNode removeDuplicate(ListNode head){
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                head = head.next;
                if(head == null){
                    ans.next = null;
                }
            }
            else{
                ans.next = head;
                ans = ans.next;
                head = head.next;
            }
        }
        return ansHead.next;
    }
    
}
