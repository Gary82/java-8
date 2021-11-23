package com.practice.solution;

/**
 * 判斷輸入的數字是否為回文格式
 * answer: 查看tracker中有無與目前i符合的值，有的話返回，沒有就將target減去目標數字與位子裝進tracker中，做為之後比對依據
 */
public class PalindromeNumber {
    public boolean answer(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
