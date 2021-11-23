package com.practice.solution;

import java.util.HashMap;

/**
 * 找出陣列中 兩數相加為target的數字位子
 * answer: 查看tracker中有無與目前i符合的值，有的話返回，沒有就將target減去目標數字與位子裝進tracker中，做為之後比對依據
 */
public class TwoSum {
    public int[] answer(int[] nums, int target) {
        //key：放相減後的值 value：放位子
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            //判斷是否有符合的值的key 有的話回傳 對應value及現在的位子，沒符合則與答案相減放到對應的key value
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
