/*
Problem: Operations on Tree
Platform: LeetCode
Difficulty: Medium
Topics: Array, Hash Table, Tree, Depth-First Search, Breadth-First Search, Design
URL: https://leetcode.com/problems/operations-on-tree/
*/
class LockingTree {

    int[] parent;
    int[] locked;
    java.util.List<Integer>[] children;

    public LockingTree(int[] parent) {

        this.parent = parent;

        int n = parent.length;

        locked = new int[n];

        children = new java.util.ArrayList[n];

        for (int i = 0; i < n; i++) {
            children[i] = new java.util.ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            children[parent[i]].add(i);
        }
    }

    public boolean lock(int num, int user) {

        if (locked[num] != 0) {
            return false;
        }

        locked[num] = user;

        return true;
    }

    public boolean unlock(int num, int user) {

        if (locked[num] != user) {
            return false;
        }

        locked[num] = 0;

        return true;
    }

    public boolean upgrade(int num, int user) {

        // 1. Current node unlocked hona chahiye
        if (locked[num] != 0) {
            return false;
        }

        // 2. Koi ancestor locked nahi hona chahiye
        int curr = parent[num];

        while (curr != -1) {

            if (locked[curr] != 0) {
                return false;
            }

            curr = parent[curr];
        }

        // 3. At least one locked descendant hona chahiye
        if (!unlockDescendants(num)) {
            return false;
        }

        // Current node ko lock karo
        locked[num] = user;

        return true;
    }

    private boolean unlockDescendants(int node) {

        boolean found = false;

        for (int child : children[node]) {

            if (locked[child] != 0) {
                locked[child] = 0;
                found = true;
            }

            if (unlockDescendants(child)) {
                found = true;
            }
        }

        return found;
    }
}
