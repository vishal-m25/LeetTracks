class Solution {
    public char findTheDifference(String s, String t) {
        String ss="";
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        char result = 0;
        for (char c : sa) {
            result ^= c;
        }
        for (char c : ta) {
            result ^= c;
        }
        return result;
    }
}
