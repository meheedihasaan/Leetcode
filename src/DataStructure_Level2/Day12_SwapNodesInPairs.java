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
public class Day12_SwapNodesInPairs {
    
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
    
    public ListNode swapPairs(ListNode head){
        if(head != null && head.next == null){
            return head;
        }
        
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        ListNode first = head;
        while(first != null && first.next != null){
            ListNode second = first.next;
            ListNode next = first.next.next;
            second.next = first;
            ans.next = second;
            ans = first;
            first.next = next;
            first = next;
        }
        return ansHead;
    }
    
}
