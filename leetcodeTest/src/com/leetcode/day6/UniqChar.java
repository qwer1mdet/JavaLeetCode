package com.leetcode.day6;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 */
public class UniqChar {
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        //把字符串拆分放进hashMap中
        for (int i = 0; i < s.length(); i++) {
            char string=s.charAt(i);
            int count=hashMap.getOrDefault(string,0)+1;
            hashMap.put(string,count);
        }
        //遍历hashMap
        for (Map.Entry<Character, Integer> x:hashMap.entrySet()
        ) {
            System.out.println(x.getKey()+","+x.getValue());
        }
        //循环
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}
