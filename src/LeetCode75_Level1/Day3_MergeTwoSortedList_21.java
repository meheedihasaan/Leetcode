/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeetCode75_Level1;

/**
 *
 * @author Acer
 */



public class Day3_MergeTwoSortedList_21 {  
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        ListNode merged = new ListNode(0);
        ListNode head = merged;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                merged.next = list1;
                list1 = list1.next;
            }
            else{
                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }
        
        
        if(list1 != null){
            merged.next = list1;
            //list1 = list1.next;
        }
        
        if(list2 != null){
            merged.next = list2;
            //list2 = list2.next;
        }
        return head.next;
    }
    
}
