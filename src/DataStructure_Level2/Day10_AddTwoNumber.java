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
public class Day10_AddTwoNumber {
    
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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        int carry = 0;
        while(l1 != null && l2 != null){
            int sum = l1.val+l2.val+carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            int sum = l1.val+carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            l1 = l1.next;
        }
        
        while(l2 != null){
            int sum = l2.val+carry;
            carry = sum/10;
            sum = sum%10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            l2 = l2.next;
        }
        
        if(carry != 0){
            ans.next = new ListNode(carry);
        }
        
        return head.next;
    }
    
}
