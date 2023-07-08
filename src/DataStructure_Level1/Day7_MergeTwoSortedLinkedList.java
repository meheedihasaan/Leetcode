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
public class Day7_MergeTwoSortedLinkedList {
    
    class ListNode{
        int data;
        ListNode next;
        ListNode(){
            
        }
        ListNode(int data){
            this.data = data;
        }
        ListNode(int data, ListNode next){
            this.data = data;
            this.next = next;
        }
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //If any of the LinkedList is already empty
        if(list1 == null){
            return list2;
        }
        
        if(list2 == null){
            return list1;
        }
        
        //Merged LinkedList Initialization
        ListNode merged = new ListNode(0);
        ListNode head = merged;
        while(list1 != null && list2 != null){
            if(list1.data <= list2.data){
                merged.next = list1;
                list1 = list1.next;
            }
            else{
                merged.next = list2;
                list2 = list2.next;
            }
            merged = merged.next;
        }
        
        //If list1 is not empty then linked Merged to List1
        if(list1 != null){
            merged.next = list1;
        }
        
        //If list2 is not empty then linked Merged to List2
        if(list2 != null){
            merged.next = list2;
        }
        
        //Return the next node of Head of Merged LinkedList
        return head.next;
    }
    
}
