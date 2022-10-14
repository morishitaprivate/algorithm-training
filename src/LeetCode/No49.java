package LeetCode;

import java.util.List;

public class No49 {
	public static void main(String[] args) {
	}
}
// wrong
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String S = strs[i];
            int sum = 0;
            for (int j = 0; j < S.length(); j++) {
                sum += (int)S.charAt(j);
            }
            map.putIfAbsent(sum, new ArrayList<String>());
            map.get(sum).add(S);
        }
        for (int key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
}
//correct
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] hash = new char[26]; //a~z : 97~122
            for (char ch : strs[i].toCharArray()) {
                hash[ch - 'a']++;
            }
            System.out.println(hash);
            String S = new String(hash);
            map.putIfAbsent(S, new ArrayList<String>());
            map.get(S).add(strs[i]); 
        }
        for (String key : map.keySet()) {
            ans.add(map.get(key));
        }
        return ans;
    }
}
