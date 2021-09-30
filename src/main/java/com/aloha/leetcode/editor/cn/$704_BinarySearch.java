/*
 * Copyright (c) 2021. All rights reserved.
 * @LeetCode Question: 二分查找
 * @Author: chulei
 * @Date: 2021/9/27 上午12:12
 */

package com.aloha.leetcode.editor.cn;


public class $704_BinarySearch{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int idx = solution.search(new int[]{1, 2, 3, 4}, 2);
        System.out.println(idx);
    }
    static
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            int mid = 0;
            while(left<=right) {
                mid = left + (right-left)/2;
                if (nums[mid]>target) {
                    right = mid -1;
                } else if (nums[mid]<target) {
                    left = mid + 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)
}






//给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否
//则返回 -1。 
//
// 
//示例 1: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 9
//输出: 4
//解释: 9 出现在 nums 中并且下标为 4
// 
//
// 示例 2: 
//
// 输入: nums = [-1,0,3,5,9,12], target = 2
//输出: -1
//解释: 2 不存在 nums 中因此返回 -1
// 
//
// 
//
// 提示： 
//
// 
// 你可以假设 nums 中的所有元素是不重复的。 
// n 将在 [1, 10000]之间。 
// nums 的每个元素都将在 [-9999, 9999]之间。 
// 
// Related Topics 数组 二分查找 👍 432 👎 0
