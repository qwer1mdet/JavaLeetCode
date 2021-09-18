package com.leetcode.day6;

public class main {
    public static void main(String[] args) {
        String a="loveleetcode";
        System.out.println(UniqChar.firstUniqChar(a));
        System.out.println("-------------------------");
        System.out.println(Anagram.isAnagram("anagram", "nagaram"));
        System.out.println("-------------------------");
        boolean b = Construct.canConstruct1("aa", "aab");
        System.out.println("b="+b);
    }
}
