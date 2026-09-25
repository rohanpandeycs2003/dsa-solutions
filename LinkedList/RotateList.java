/*
Problem: Rotate List
Platform: LeetCode
Difficulty: Medium
Topics: Linked List, Two Pointers
URL: https://leetcode.com/problems/rotate-list/
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        if(k == 0){
            return head;
        }
        //circular
        temp.next = head;
        //find new tail
        ListNode newTail = head;
        for(int i = 1 ; i < len - k ; i++){
            newTail = newTail.next;
        }
        //new head
        ListNode newHead = newTail.next;
        //cycle break
        newTail.next = null;
        return newHead;
    }
}
