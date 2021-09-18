package com.leetcode.day3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1={7,1,5,3,6,4};
        int maxnum = Maxprofit.maxProfit(array1);
        System.out.println(maxnum);
        System.out.println("-------------------");
        int[] array2={1,2,2,1};
        int[] array3={2,2};
        int[] intersect = Intersection.intersect(array2, array3);
        System.out.println("交集："+ Arrays.toString(intersect));
    }
}
