/*
Problem: Level of a Node in Binary Tree
Platform: GeeksforGeeks
Difficulty: Easy
Topics: Tree
URL: https://www.geeksforgeeks.org/problems/level-of-a-node-in-binary-tree/1
*/
class Solution {
    int getLevel(Node root, int target) {

        if (root == null) {
            return 0;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int level = 1;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int i = 0; i < size; i++) {

                Node curr = q.poll();

                if (curr.data == target) {
                    return level;
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            level++;
        }

        return 0;
    }
}
