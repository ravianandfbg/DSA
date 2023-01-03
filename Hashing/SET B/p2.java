// https://stackoverflow.com/questions/64418218/smallest-subarray-with-sum-equal-to-k

// Input: arr[] = {2, 4, 6, 10, 2, 1}, K = 12 
// Output: 2
// Explanation: All possible subarrays with sum 12 are {2, 4, 6} and {10, 2}.

// Time : O(N)
// Space : O(N)

import java.util.HashMap;

public class Main {
  public static int smallestSubarray(int[] arr, int k) {
    // Store the sum and the index for each prefix sum
    HashMap<Integer, Integer> prefixSums = new HashMap<>();
    prefixSums.put(0, -1);

    int minLength = Integer.MAX_VALUE;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
      int target = sum - k;
      if (prefixSums.containsKey(target)) {
        int length = i - prefixSums.get(target);
        minLength = Math.min(minLength, length);
      }
      if (!prefixSums.containsKey(sum)) {
        prefixSums.put(sum, i);
      }
    }

    return minLength == Integer.MAX_VALUE ? -1 : minLength;
  }

  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 10, 2, 1};
    int k = 12;
    int result = smallestSubarray(arr, k);
    System.out.println(result);
  }
}
