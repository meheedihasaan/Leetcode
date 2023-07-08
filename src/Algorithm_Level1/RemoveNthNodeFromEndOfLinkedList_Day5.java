/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithm_Level1;

/**
 *
 * @author Acer
 */
public class RemoveNthNodeFromEndOfLinkedList_Day5 {
    
    public class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data = data;
        }
        ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode first = head;
        for(int i = 0; i < n; i++){
            first = first.next;
        }
        
        if(first == null){
            head = head.next;
            return head;
        }
        
        while(first.next != null){
            slow = slow.next;
            first = first.next;
        }
        slow.next = slow.next.next;
        
        return head;
    }
    
}
