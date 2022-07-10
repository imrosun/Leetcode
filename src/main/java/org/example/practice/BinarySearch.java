package org.example.practice;

public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {-1,0,3,5,9,12};
        System.out.println(search(num,9));
    }
    public static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length-1;

        while (s <= e){
            int m  = s + (e-s) /2;
            if(nums.length == 0){
                return -1;
            }
            if(target == nums[m]){
                return m;
            }else if(target < nums[m]){
                e = m - 1;
            }else if(target >nums[m]){
                s = m+1;

            }
        }
        return -1;
    }
}
