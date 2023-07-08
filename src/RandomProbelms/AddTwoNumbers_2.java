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
public class AddTwoNumbers_2 {
    
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
    
    public static ListNode addTwo(ListNode L1, ListNode L2){
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        int carry = 0;
        while(L1 != null && L2 != null){
            int sum = L1.val + L2.val + carry;
            carry = sum/10;
            sum%=10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            L1 = L1.next;
            L2 = L2.next;
        }
        
        //if L1 size is greter than L2
        while(L1 != null){
            int sum = L1.val + carry;
            carry = sum/10;
            sum%=10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            L1 = L1.next;
        }
        
        //if L2 size is greater than L1
        while(L2 != null){
            int sum = L2.val + carry;
            carry = sum/10;
            sum%=10;
            ans.next = new ListNode(sum);
            ans = ans.next;
            L2 = L2.next;
        }
        
        //Add The Final Carry
        if(carry > 0){
            ans.next = new ListNode(carry);
        }
        return head.next;
    }
    
    public static void main(String[] args) {
        ListNode L1 = new ListNode(2);
        ListNode head1 = L1;
        L1.next = new ListNode(4);
        L1 = L1.next;
        L1.next = new ListNode(4);
        L1 = L1.next;
        
        ListNode L2 = new ListNode(5);
        ListNode head2 = L2;
        L2.next = new ListNode(6);
        L2 = L2.next;
        L2.next = new ListNode(4);
        L2 = L2.next;
        
        ListNode ans = addTwo(head1, head2);
        while(ans != null){
            System.out.print(ans.val+" ");
            ans = ans.next;
        }
    }
    
}
