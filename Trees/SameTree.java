/*
Problem: Same Tree
Platform: LeetCode
Difficulty: Easy
Topics: Tree, Depth-First Search, Breadth-First Search, Binary Tree
URL: https://leetcode.com/problems/same-tree/
*/
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        // Dono null hain
        if (p == null && q == null) {
            return true;
        }

        // Ek null hai aur doosra nahi
        if (p == null || q == null) {
            return false;
        }

        // Values different hain
        if (p.val != q.val) {
            return false;
        }

        // Left aur right dono same hone chahiye
        return isSameTree(p.left, q.left) &&
               isSameTree(p.right, q.right);
    }
}
