package LeetCode;

public class No394 {

}
class Solution {
    public String decodeString(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                StringBuilder sb = new StringBuilder();
                while(stack.peek() != '[') {
                    sb.insert(0,stack.pop());
                }
                stack.pop(); //'['
                int tmp = 0;
                int count = 0;
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    count = (int)Math.pow(10,tmp) * Character.getNumericValue(stack.pop()) + count;
                    tmp++;
                }
                for (int j = 0; j < count; j++) {
                    for (Character ch : sb.toString().toCharArray()) {
                        stack.addFirst(ch);
                    }
                }
            } else {
                stack.addFirst(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            ans.append(stack.removeLast());
        }
        return ans.toString();
    }
}
