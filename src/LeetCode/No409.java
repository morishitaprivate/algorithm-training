package LeetCode;

public class No409 {

}
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        boolean check = true;
        for (int i = 0; i < s.length(); i++) {
            map.putIfAbsent(s.charAt(i), 0);
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        for (char key : map.keySet()) {
            ans += (map.get(key) / 2) * 2;
            if (map.get(key) % 2 == 1) check = false;
            
        }
        if (check) return ans;
        return ans + 1;
    }
}
class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
}