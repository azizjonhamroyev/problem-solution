package Reformat_The_String;

import java.util.Stack;

class Solution {
    public String reformat(String s) {
        Stack<Character> nums = new Stack<>();
        Stack<Character> alp = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                alp.add(c);
            } else {
                nums.add(c);
            }
        }

        if (Math.abs(nums.size() - alp.size()) > 1) {
            return "";
        }

        StringBuilder res = new StringBuilder();

        if (nums.size() > alp.size()) {
            while (!nums.isEmpty() && !alp.isEmpty()) {
                res.append(nums.pop());
                res.append(alp.pop());
            }
        } else {
            while (!alp.isEmpty() && !nums.isEmpty()) {
                res.append(alp.pop());
                res.append(nums.pop());
            }
        }

        if (!nums.isEmpty()) {
            res.append(nums.pop());
        }

        if (!alp.isEmpty()) {
            res.append(alp.pop());
        }
        return res.toString();
    }
}
