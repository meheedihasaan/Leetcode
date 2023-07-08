/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author User
 */

//Problem Link: https://leetcode.com/problems/odd-even-linked-list/

public class OddEvenLinkedList {
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
    
    public ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode oddList = head;
        ListNode ansHead = oddList;
        ListNode evenList = head.next;
        ListNode evenHead = evenList;
        while(oddList.next != null && evenList.next != null){
            oddList.next = oddList.next.next;
            oddList = oddList.next;
            evenList.next = evenList.next.next;
            evenList = evenList.next;
        }
        evenList.next = null;
        oddList.next = evenHead;
        
        return ansHead;
    }
}
