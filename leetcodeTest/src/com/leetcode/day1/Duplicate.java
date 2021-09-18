package com.leetcode.day1;

import java.util.HashMap;
import java.util.Map;

/**             217
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 *
 * 例子：输入: [1,2,3,1]
 *      输出: true
 *
 *      输入: [1,2,3,4]
 *      输出: false
 */
public class Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                return true;
            }else {
                hashMap.put(nums[i], i);
            }
        }
        return false;
    }
}
