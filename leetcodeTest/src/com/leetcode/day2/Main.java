package com.leetcode.day2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrays={2,7,11,15};
        int[] ints = TwoSum.twoSum(arrays, 26);
        System.out.println(Arrays.toString(ints));
        System.out.println("------------------------");
        int[] array1={1,2,3,0,0,0};
        int[] array2={2,5,6};
        Merge.merge(array1, 3, array2, 3);
    }
}
