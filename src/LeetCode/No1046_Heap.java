package LeetCode;

public class No1046_Heap {

}
//class Solution {
//public int lastStoneWeight(int[] stones) {
//  List<Integer> list = new ArrayList<>();
//  for (int num : stones) {
//      list.add(num);
//  }
//  while (list.size() > 1) {
//      Collections.sort(list);
//      if (list.get(list.size() - 1) == list.get(list.size() - 2)) {
//          list.remove(list.size()-1);
//          list.remove(list.size()-1);
//      } else {
//          int num = list.get(list.size()-2);
//          list.remove(list.size()-2);
//          list.set(list.size()-1, list.get(list.size()-1)-num);
//      }
//  }
//  return list.isEmpty() ? 0 : list.get(0);
//}
//}
class Solution {
public int lastStoneWeight(int[] stones) {
 PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
 for (int stone : stones) maxHeap.add(-stone);
 while (maxHeap.size() > 1) {
     int stone1 = -maxHeap.remove();
     int stone2 = -maxHeap.remove();
     if (stone1 != stone2) maxHeap.add(-(stone1-stone2));
 }
 return maxHeap.isEmpty() ? 0 : -maxHeap.remove();
}
}
