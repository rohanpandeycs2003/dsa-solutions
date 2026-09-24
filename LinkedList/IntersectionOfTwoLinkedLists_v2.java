/*
Problem: Intersection of Two Linked Lists
Platform: LeetCode
Difficulty: Easy
Topics: Hash Table, Linked List, Two Pointers
URL: https://leetcode.com/problems/intersection-of-two-linked-lists/
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int alen = 0;
        int blen = 0;
        ListNode a = headA;
        ListNode b = headB;

        while(a != null){
            alen++;
            a = a.next;
        }
        while(b != null){
            blen++;
            b = b.next;
        }
        while(alen>blen){
            headA = headA.next;
            alen--;
        }
        while(blen>alen){
            headB = headB.next;
            blen--;
        }
        //barabar hai ab toh ;
        while(headA != null && headB != null){
            if(headA == headB){
                return headA;
            }
            else{
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
        
    }
}
