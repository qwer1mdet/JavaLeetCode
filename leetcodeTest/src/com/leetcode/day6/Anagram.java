package com.leetcode.day6;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 注意：若s 和 t中每个字符出现的次数都相同，则称s 和 t互为字母异位词。
 *
 *示例 1:
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 */
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        /*HashMap<Character, Integer> hashMap1 = new HashMap<>();
        HashMap<Character, Integer> hashMap2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            hashMap1.put(ch,hashMap1.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < t.length(); i++) {
            char ch1=t.charAt(i);
            hashMap2.put(ch1,hashMap1.getOrDefault(ch1,0)+1);
        }*/
        char[] chars = s.toCharArray();
        char[] chars1 = t.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals(chars,chars1);
    }
}
