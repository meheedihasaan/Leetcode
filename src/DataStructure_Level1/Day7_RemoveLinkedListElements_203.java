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
public class Day7_RemoveLinkedListElements_203 {
    
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
    
    public ListNode removeElements(ListNode head, int val) {
        //Initialize Newly formed LilnkedList
        ListNode p = new ListNode(0);
        ListNode ansHead = p;
        while(head != null){
            if(head.val != val){
                p.next = head;
                p = p.next;
            }
            head = head.next;
        }
        p.next = null;
        return ansHead.next;
    }
    
}
