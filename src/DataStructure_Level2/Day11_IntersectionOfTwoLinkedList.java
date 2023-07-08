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
public class Day11_IntersectionOfTwoLinkedList {
    
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
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            if(temp1 == null){
                temp1 = headB;
            }
            else{
                temp1 = temp1.next;
            }
            
            if(temp2 == null){
                temp2 = headA;
            }
            else{
                temp2 = temp2.next;
            }
        }
        return temp1;
    }
    
}
