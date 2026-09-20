/*
Problem: Remove Duplicates from Sorted List
Platform: LeetCode
Difficulty: Easy
Topics: Linked List
URL: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        if(temp == null){
            return head;
        }
        if(temp.next == null){
            return head;
        }
        ListNode curr = head;
        ListNode fr = head.next;
        while (fr != null){
            if(curr.val == fr.val){
                curr.next = fr.next;
                fr = fr.next;
            }
            else{
                curr = curr.next;
                fr = fr.next;
            }
        }
        return head;
        
    }
}
