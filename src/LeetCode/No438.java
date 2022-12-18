package LeetCode;

public class No438 {

}
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        for (char ch : p.toCharArray()) {
            map.putIfAbsent(ch,0);
            map.put(ch, map.get(ch)+1);
        }
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            Map<Character,Integer> tmp = new HashMap<>(map);
            for (int j = 0; j < p.length(); j++) {
                if (!tmp.containsKey(s.charAt(j+i))) break;
                tmp.put(s.charAt(j+i), tmp.get(s.charAt(j+i))-1);
                if (tmp.get(s.charAt(j+i)) == 0) tmp.remove(s.charAt(j+i));
            }
            if (tmp.isEmpty()) list.add(i);
        }
        return list;
    }
}
