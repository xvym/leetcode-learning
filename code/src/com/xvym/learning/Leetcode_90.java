package com.xvym.learning;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: Xv
 * @Date: 2021/1/5 0:06
 * @Description:
 */
public class Leetcode_90 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        System.out.println(subsetsWithDup(nums));
    }

    private static Set<List<Integer>> set = new HashSet<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Collections.emptyList());
        Arrays.sort(nums);
        backtrack(res, nums, 0);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, int[] nums, int currentIndex) {
        if (currentIndex < nums.length) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> currentSubSet : res) {
                List<Integer> currentNewSubSet = new ArrayList<>(currentSubSet);
                currentNewSubSet.add(nums[currentIndex]);
                if (!set.contains(currentNewSubSet)) {
                    temp.add(currentNewSubSet);
                    set.add(currentNewSubSet);
                }
            }
            res.addAll(temp);
            backtrack(res, nums, currentIndex + 1);
        }
    }

}
