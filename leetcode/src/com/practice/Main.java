package com.practice;

import com.practice.solution.PalindromeNumber;
import com.practice.solution.Practice;
import com.practice.solution.RomanToInteger;
import com.practice.solution.TwoSum;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TwoSum twoSum=new TwoSum();
        int[] data= {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(twoSum.answer(data, 8)));

        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.answer(12321));
        System.out.println(palindromeNumber.answer(1231));

        RomanToInteger romanToInteger=new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("VXII"));

        Practice practice = new Practice();
        practice.answer();
    }
}
