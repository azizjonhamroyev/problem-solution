package Lexicographical_Numbers;

import java.util.ArrayList;
import java.util.List;

class Solution {
    private final List<Integer> list = new ArrayList<>();

    private int n;

    public List<Integer> lexicalOrder(int n) {
        this.n = n;
        for (int i = 1; i < 10; i++) {
            dfs(i);
        }
        return this.list;
    }

    private void dfs(int k) {
        if (this.n < k) return;
        this.list.add(k);
        for (int i = 0; i < 10; i++) {
            int a = 10 * k;
            dfs(a + i);
        }
    }
}
