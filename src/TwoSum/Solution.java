package TwoSum;

import java.util.HashMap;

/**
 * 两数之和的问题
 *
 * 可以借助 hashmap 求解
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 可以使用hashmap
        int[] result = new int[2];
        HashMap<Integer,Integer> res = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (res.containsKey(temp)){
                result[0] = res.get(temp);
                result[1] = i;
            }
            res.put(nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3,2,4};
        int target = 6;
        int[] res = solution.twoSum(nums,target);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
