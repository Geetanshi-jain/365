
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        Solution s = new Solution();
        int ans = s.thirdMax(nums);
        System.out.println(ans);

    }

    public int thirdMax(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.size());

        if (list.size() >= 3) {
            return list.get(2);
        } else {
            return list.get(list.size() - 1);
        }
    }

}