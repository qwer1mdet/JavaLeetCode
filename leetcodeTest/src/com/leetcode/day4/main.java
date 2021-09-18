package com.leetcode.day4;

import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<List<Integer>> generate = Generata.generate(5);
        for (List<Integer> x:generate
             ) {
            System.out.println(x);
        }
        System.out.println("----------------------");
        int[][] arr={{1,2},{3,4}};
        int[][] ints = Reshape.matrixReshape(arr, 1, 4);
        for (int[] x:ints
             ) {
            for (int e:x
                 ) {
                System.out.println(e);
            }
        }
    }
}
