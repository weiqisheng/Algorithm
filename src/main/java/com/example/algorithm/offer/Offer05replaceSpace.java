package com.example.algorithm.offer;

/**
 * @author weiqisheng
 * @Title: Offer05replaceSpace
 * @ProjectName algorithm
 * @Description: TODO 替换空格
 * @date 2021/2/199:52
 */
// TODO 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
public class Offer05replaceSpace {

    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (Character c : s.toCharArray()){
            if (c == ' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
