package LeetCode;

public class No20 {

}
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        Deque<Character> stack  = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.addFirst(ch);
            } else {
                if (stack.isEmpty()) return false;
                char ch2 = stack.removeFirst();
                if (map.get(ch2) != ch) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }
}