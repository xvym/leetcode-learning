package com.xvym.learning;

/**
 * @Author: Xv
 * @Date: 2021/1/2 19:39
 * @Description:
 */
public class Leetcode_605 {
    public static void main(String[] args) {
        int[] flowerde = {1};
        System.out.println(canPlaceFlowers(flowerde, 0));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int count = 0;
        if (length == 1) {
            return flowerbed[0] == 0 || n == 0;
        }
        for (int i = 0; i < length; i++) {
            if (i == 0 && flowerbed[i] != 1) {
                if (flowerbed[i + 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            } else if (i != 0 && i != length - 1 && flowerbed[i] != 1 && flowerbed[i - 1] != 1 && flowerbed[i + 1] != 1) {
                count++;
                flowerbed[i] = 1;
            } else if (i == length - 1 && flowerbed[i] != 1) {
                if (flowerbed[i - 1] == 0) {
                    count++;
                    flowerbed[i] = 1;
                }
            }
        }
        return count >= n;
    }
}
