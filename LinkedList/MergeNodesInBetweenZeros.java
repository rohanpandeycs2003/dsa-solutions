/*
Problem: Merge Nodes in Between Zeros
Platform: LeetCode
Difficulty: Medium
Topics: Linked List, Simulation
URL: https://leetcode.com/problems/merge-nodes-in-between-zeros/
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
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        ListNode write = head;
        while(read != null){
            int sum  = 0;

            //sum
            while(read.val != 0){
                sum = sum + read.val;
                read = read.next;
            }
            //wrte krrna 
            write.val = sum;
            write.next = read.next;
            read = read.next;
            write = write.next;
        }
        return head;
    }
}
