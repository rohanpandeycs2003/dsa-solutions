/*
Problem: Palindrome Linked List
Platform: LeetCode
Difficulty: Easy
Topics: Linked List, Two Pointers, Stack, Recursion
URL: https://leetcode.com/problems/palindrome-linked-list/
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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode fr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fr;   
        }
        return prev;
    }
    public ListNode midPoint(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        while(fast!=null){
            fast = fast.next;
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }
        //mid 
        ListNode midVal = midPoint(head);
        //break
        ListNode temp = head;
        while(temp.next != midVal){
            temp = temp.next;
        }
        temp.next = null;
        //reverse 
        ListNode head2  = reverse(midVal);
        //compare 
        ListNode temp1 = head;
        ListNode temp2 = head2;
        while(temp1!= null && temp2 != null){
            if(temp1.val != temp2.val){
                return false;
            }
            else{
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

        }
        return true;
    }
}
