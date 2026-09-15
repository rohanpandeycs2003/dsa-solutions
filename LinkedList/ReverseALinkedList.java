/*
Problem: Reverse a Linked List
Platform: GeeksforGeeks
Difficulty: Easy
Topics: Linked List
URL: https://www.geeksforgeeks.org/problems/reverse-a-linked-list/1
*/
/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node curr = head;
        Node prev = null;
        while(curr != null){
            Node fr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fr;
        }
        return prev;
    }
}
