package one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author msc
 * @version 1.0
 * @description: TODO
 * @date 2022/5/3 21:37
 * 第一题两数之和
 */
public class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     int[] ints = new int[2];
    //     for (int i = 0; i < nums.length-1; i++) {
    //         for(int j = i+1; j <nums.length;j++){
    //             if(nums[i] + nums[j] == target){
    //                 ints[0] = nums[i];
    //                 ints[1] = nums[j];
    //                 return ints;
    //             }
    //         }
    //     }
    //     return null;
    // }
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[] {map.get(target-nums[i]),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        Solution s = new Solution();
        int[] i = s.twoSum(nums,target);
        System.out.println(Arrays.toString(i));

    }
}
