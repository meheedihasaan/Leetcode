/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandomProbelms;

/**
 *
 * @author Acer
 */
public class InsertionSortInAList {
    
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
    
    public ListNode insertionSort(ListNode head){
        ListNode ans = new ListNode(-10000);
        while(head != null){
            ListNode next = head.next;
            ListNode temp = ans;
            while(temp.next != null && temp.next.val < head.val){
                temp = temp.next;
            }
            head.next = temp.next;
            temp.next = head;
            head = next;
        }
        return ans.next;
    }
    
}
