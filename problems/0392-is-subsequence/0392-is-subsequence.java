class Solution {
    public boolean isSubsequence(String s, String t) {
        int pos = 0;
        for (int i = 0; i < t.length(); i++) {
            if (pos < s.length() && s.charAt(pos) == t.charAt(i)) {
                pos++;
            }
        }
        return pos == s.length();
    }
}