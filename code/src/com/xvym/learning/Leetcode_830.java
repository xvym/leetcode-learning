package com.xvym.learning;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xv
 * @Date: 2021/1/5 23:05
 * @Description:
 */
public class Leetcode_830 {

    public static void main(String[] args) {
        String s = "ahfsahfjfhfhfhfhhhhhlasjalaaaaksljlfjajjjaa";
        System.out.println(largeGroupPositions(s));
    }

    public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            String targetStr = String.valueOf(s.charAt(i));
            int endIndex = i;
            for (int j = i; j < s.length(); j++) {
                String currentStr = String.valueOf(s.charAt(j));
                if (!targetStr.equals(currentStr)) {
                    break;
                } else {
                    endIndex = j;
                }
            }
            if (endIndex - i >= 2) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                temp.add(endIndex);
                res.add(temp);
                i = endIndex;
            }
        }
        return res;
    }

}
