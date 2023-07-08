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
public class MiddleOfTheLinkedList_Day5 {
    
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
    
    public ListNode middle(ListNode head){
        ListNode p = head;
        ListNode q = head;
        while(q != null && q.next != null){
            p = p.next;
            q = q.next.next;
        }
        return p;
    }
    
}
