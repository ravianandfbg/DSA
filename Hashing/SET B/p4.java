// https://leetcode.com/problems/continuous-subarray-sum/

// Example 1:

// Input: nums = [23,2,4,6,7], k = 6
// Output: true
// Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
// Example 2:

// Input: nums = [23,2,6,4,7], k = 6
// Output: true
// Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
// 42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
// Example 3:

// Input: nums = [23,2,6,4,7], k = 13
// Output: false

// Time : O(N)
// Space : O(N)

class Solution {
      public boolean checkSubarraySum(int[] nums, int k) {
          HashMap<Integer,Integer> prefixSum = new HashMap<>();
          prefixSum.put(0,-1);
          
          int ps = 0; // prefix sum
          for(int i = 0 ; i < nums.length ; i++){
              ps += nums[i];
              
              int mod = ps % k;
              
              if(mod < 0){
                  mod += k;
              }
              
              if(prefixSum.containsKey(mod)){
                  int length = i - prefixSum.get(mod);
                  if(length >= 2){
                      return true;
                  }
              }
              if(!prefixSum.containsKey(mod)){
                  prefixSum.put(mod , i);
              }
          }
          
          return false;
      }
  }