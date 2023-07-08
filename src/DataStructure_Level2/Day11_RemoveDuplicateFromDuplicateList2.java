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
public class Day11_RemoveDuplicateFromDuplicateList2 {

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
    
    public ListNode deleteDuplicates(ListNode head) {
//        int arr[] = new int[201];
//        while(head != null){
//            arr[100+head.val]++;
//            head = head.next;
//        }
//        
//        ListNode ans = new ListNode();
//        ListNode ansHead = ans;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 1){
//                int x = i-100;
//                ans.next = new ListNode(x);
//                ans = ans.next;
//            }
//        }
//        return ansHead.next;
        
        if(head != null && head.next == null){
            return head;
        }
        
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                head = head.next;
            }
            else{
                ans.next = head;
                ans = ans.next;
                head = head.next;
            }                       
        }
        ans.next = null;
        return ansHead.next;
    }
    
}
