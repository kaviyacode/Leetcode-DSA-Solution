/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        //start a slow and fast pointer
        ListNode slowptr=head;
        ListNode fastptr=head;
        while(slowptr!=null && fastptr!=null && fastptr.next!=null){
            //Advance both the pointers
            slowptr=slowptr.next;
            fastptr=fastptr.next.next;
            //If they meet,means we found a loop
            if(slowptr==fastptr){
                return true;
            }
        }

    return false;   
    }
}