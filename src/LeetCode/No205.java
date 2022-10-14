package LeetCode;

public class No205 {

}
class Solution {
    public boolean isIsomorphic(String s, String t) {
        // List<Integer> sList = new ArrayList<>();
        // List<Integer> tList = new ArrayList<>();
        // for (int i = 0; i < s.length(); i++) {
        //     sList.add((int)s.charAt(i));
        //     tList.add((int)t.charAt(i));
        // }
        // boolean ans = true;
        // for (int i = 0; i < s.length(); i++) {
        //     if (sList.indexOf(sList.get(i)) != tList.indexOf(tList.get(i))) {
        //         ans = false;
        //     }
        // }
        // return ans;
        boolean ans = true;
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == null) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    ans = false;
                }
            }
            if (map2.get(t.charAt(i)) == null) {
                map2.put(t.charAt(i), s.charAt(i));
            } else {
                if (map2.get(t.charAt(i)) != s.charAt(i)) {
                    ans = false;
                }
            }
        }
        return ans;

    }
}