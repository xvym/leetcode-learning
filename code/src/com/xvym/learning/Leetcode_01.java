package com.xvym.learning;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Xv
 * @Date: 2021/1/3 23:26
 * @Description:
 */
public class Leetcode_01 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int target = 5;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // case 1
        // for(int i = 0; i < nums.length - 1; i++) {
        //     for(int j = i + 1; j < nums.length; j++)
        //     {
        //        int sum = nums[i] + nums[j];
        //        if (sum == target){
        //            result[0] = i;
        //            result[1] = j;
        //        }
        //     }
        // }

        // case 2
        // Map<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i < nums.length; i++){
        //     map.put(i, nums[i]);
        // }
        // for(int i = 0; i < map.size() - 1; i++) {
        //     for(int j = i + 1; j < map.size(); j++) {
        //        int sum = map.get(i) + map.get(j);
        //        if (sum == target){
        //            result[0] = i;
        //            result[1] = j;
        //        }
        //     }
        // }

        //case 3
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }

}
