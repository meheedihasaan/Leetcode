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
public class Day12_DesignLinkedlist {
    
    ListNode head;
    int size;
    class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
       
    public Day12_DesignLinkedlist() {
        this.head = null;
        this.size = 0;
    }
   
    public int get(int index) {
        if(index >= size || index < 0){
            return -1;
        }
        else{
            ListNode temp = head;
            int cnt = 0;
            while(cnt < index){
                temp = temp.next;
                cnt++;
            }
            return temp.val;
        }
    }
    
    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            size++;
        }
        else{           
            ListNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            size++;
        }
    }
    
    public void addAtIndex(int index, int val) {
        if(index == 0){
            addAtHead(val);
        }
        else if(index > 0 && index <= size){
            ListNode newNode = new ListNode(val);
            ListNode temp = head;
            for(int i = 0; i < index-1; i++){
                temp = temp.next;
            }            
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {                  
        if(index == 0){
            head = head.next;
            size--;
        }
        else if(index > 0 && index < size){
            ListNode prev = head;
            //ListNode next = null;
            for (int i = 0; i < index-1; i++) {
                prev = prev.next;
            }
            //next = prev.next;
            //prev.next = next.next;
            prev.next = prev.next.next;
            size--;
        }     
    }
    
}
