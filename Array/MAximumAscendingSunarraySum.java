public class MAximumAscendingSunarraySum {

    public int maxsubarraySum(int[] nums) {
        int len = nums.length;
        int add = nums[0];
        int ans = add;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                add += nums[i - 1];
            } else {
                ans = Math.max(ans, add);
                add = nums[i];
            }
        }
        return Math.max(ans, add);
    }
}