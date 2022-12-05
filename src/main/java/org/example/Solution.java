package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public int thirdMax(int[] nums) {

       nums = Arrays.stream(nums)
               .distinct()
               .sorted()
               .toArray();

        if (nums.length == 1 || nums.length == 2){

            return Arrays.stream(nums)
                    .max()
                    .getAsInt();
        }

        return nums[nums.length - 3];
    }
}
