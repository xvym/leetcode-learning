package com.xvym.learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Xv
 * @Date: 2021/1/2 20:44
 * @Description:
 */
public class Leetcode_239 {

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int length = nums.length;
        List<Integer> resList = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < length - k + 1; i++) {
            int currentMax = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                currentMax = Math.max(nums[j], currentMax);
            }
//            res[count] = currentMax;
//            count++;
            resList.add(currentMax);
        }
        return resList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
