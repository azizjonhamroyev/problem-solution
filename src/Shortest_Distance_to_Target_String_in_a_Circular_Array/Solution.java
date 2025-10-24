package Shortest_Distance_to_Target_String_in_a_Circular_Array;

class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int min = words.length + 1, n = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                min = Math.min(min, Math.min(n - startIndex + i, Math.min(Math.abs(i - startIndex), n - i + startIndex)));
            }
        }
        if (min == n + 1) {
            return -1;
        }
        return min;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.closestTarget(new String[]{"hsdqinnoha", "mqhskgeqzr", "zemkwvqrww", "zemkwvqrww", "daljcrktje", "fghofclnwp", "djwdworyka", "cxfpybanhd", "fghofclnwp", "fghofclnwp"}, "zemkwvqrww", 8));
    }
}
