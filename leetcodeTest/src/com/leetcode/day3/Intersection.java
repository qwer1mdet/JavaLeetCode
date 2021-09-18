package com.leetcode.day3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 *
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 */
public class Intersection {
    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length>nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
                int count=hashMap.getOrDefault(nums1[i],0)+1;
                hashMap.put(nums1[i],count);
        }
        for (Map.Entry<Integer, Integer> entries:hashMap.entrySet()
             ) {
            System.out.println("key:"+entries.getKey()+"values:"+entries.getValue());
        }
        int[] arr=new int[nums1.length];
        int index=0;
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i])){
                int number=hashMap.get(nums2[i]);
                if (number>0){
                    arr[index++]=nums2[i];
                    number--;
                }
                if (number>0){
                    hashMap.put(nums2[i],number);
                }else
                {
                    hashMap.remove(nums2[i]);
                }
            }
        }
        return arr;
    }
}
