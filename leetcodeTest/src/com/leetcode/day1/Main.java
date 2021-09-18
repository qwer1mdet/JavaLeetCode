package com.leetcode.day1;

public class Main {
    public static void main(String[] args) {
        //217
        int[] arr={1,2,3,4};
        boolean b = Duplicate.containsDuplicate(arr);
        System.out.println(b);
        System.out.println("-----------------------");
        int[] arr1={-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray.maxSub(arr1);
        System.out.println(i);
    }
}
