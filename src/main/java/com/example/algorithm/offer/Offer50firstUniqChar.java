package com.example.algorithm.offer;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author weiqisheng
 * @Title: Offer50firstUniqChar
 * @ProjectName algorithm
 * @Description: TODO 第一个只出现一次的字符
 * @date 2021/3/215:36
 */
/*
在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。

示例:

s = "abaccdeff"
返回 "b"

s = ""
返回 " "
 */
public class Offer50firstUniqChar {

    public char firstUniqChar(String s) {
        char r = ' ';
        for (char c : s.toCharArray()){
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);
            if (first == last){
                return c;
            }
        }
        return r;
    }

    public char firstUniqChar1(String s) {
        HashMap<Character, Boolean> dic = new HashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(char c : sc)
            if(dic.get(c)) return c;
        return ' ';
    }

    public char firstUniqChar2(String s) {
        Map<Character, Boolean> dic = new LinkedHashMap<>();
        char[] sc = s.toCharArray();
        for(char c : sc)
            dic.put(c, !dic.containsKey(c));
        for(Map.Entry<Character, Boolean> d : dic.entrySet()){
            if(d.getValue()) return d.getKey();
        }
        return ' ';
    }
}
