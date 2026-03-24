package Count_Commas_in_Range_II;

class Solution {
    public long countCommas(long n) {
        long A = 999_999_999_999_999L, res = 0;
        while (A > 0) {
            if (n > A) {
                int curr = (String.valueOf(n).length() + 2) / 3 - 1;
                res += curr * (n - A);
                n = A;
            } else {
                A /= 1000;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(test());

    }

//    public static int test() {
//        try {
//            System.out.println("try");
//            return 1;
//        } finally {
//            System.out.println("finally");
//        }
//    }


    public static int test() {
        int[] a = {1};

        try {
            return a[0];
        } finally {
            a[0] = 5;
        }
    }


}