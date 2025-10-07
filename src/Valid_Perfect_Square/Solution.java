package Valid_Perfect_Square;

class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 1) return true;
        int l = 1, r = num / 2;
        while (l <= r) {
            int mid = r - (r - l) / 2;
            long multiply = (long) mid * mid;
            if (multiply == num) return true;
            if (multiply > num) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPerfectSquare(808201));
    }
}
