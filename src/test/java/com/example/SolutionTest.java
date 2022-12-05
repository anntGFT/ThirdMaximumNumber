package com.example;

import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    
    static Solution solution;

    int result;
    int[] nums;
    
    @BeforeAll
    static void setup(){
        
        solution = new Solution();
    }

    @Test
    public void onlyOneNumber(){

        nums = new int[] {1};
        result = 1;

        assertEquals(result, solution.thirdMax(nums));

    }

    @Test
    public void TwoNumbers(){

        nums = new int[] {1,2};
        result = 2;

        assertEquals(result, solution.thirdMax(nums));

    }

    @Test
    public void ThreeNumbers(){

        nums = new int[] {1,3,2};
        result = 1;

        assertEquals(result, solution.thirdMax(nums));

    }

    @Test
    public void FiveNumbers(){

        nums = new int[] {1,33,44,73,2};
        result = 33;

        assertEquals(result, solution.thirdMax(nums));

    }
}
