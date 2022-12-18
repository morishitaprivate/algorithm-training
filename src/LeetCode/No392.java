package LeetCode;

public class No392 {

}
class Solution {
    public boolean isSubsequence(String s, String t) {
        int now = 0;
        int tmp = 0;
        while (now < s.length()) {
            if (t.indexOf(s.charAt(now), tmp) == -1) return false; 
            tmp = t.indexOf(s.charAt(now), tmp)+1;
            now++;
        }
        return true;
    }
}
