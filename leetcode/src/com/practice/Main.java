package com.practice;

import com.practice.solution.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] data= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(twoSum.answer(data, 8)));
    }
}
