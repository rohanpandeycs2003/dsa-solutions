/*
Problem: Middle of the Linked List
Platform: LeetCode
Difficulty: Easy
Topics: Linked List, Two Pointers
URL: https://leetcode.com/problems/middle-of-the-linked-list/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        while(fast != null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
            
        }
        return slow;
    }
}
