package org.example.practice;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int[] num = new int[]{2,5,8,1};
        System.out.println(selectionSort(num));
    }
    public static int selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            // min is the index of the smallest element with an index greater or equal to i
            int min = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            // Swapping i-th and min-th elements
            int swap = nums[i];
            nums[i] = nums[min];
            nums[min] = swap;
        }
        return nums[nums.length-1];
    }
}
