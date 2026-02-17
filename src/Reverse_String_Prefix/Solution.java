package Reverse_String_Prefix;

class Solution {
    public String reversePrefix(String s, int k) {
        StringBuilder pref = new StringBuilder(s.substring(0, k)).reverse();
        return pref.append(s.substring(k)).toString();
    }
}