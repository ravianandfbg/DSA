// https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
// input: arr[] = {0, -1, 2, -3, 1}, x= -2
// Output: Yes
// Explanation:  If we calculate the sum of the output,1 + (-3) = -2

// TWO SUM
// Time : O(N)
// Space : O(N)

// HashSet (GFG)
// import java.util.*;

// class Main{
//       //HashSet
//     public static void Pair(int[] arr , int sum){
//         HashSet<Integer> hash = new HashSet<>();
//         for(int i = 0 ; i < arr.length ; i++){
//             int key = sum - arr[i];
            
//             if(hash.contains(key)){
//                 System.out.println("Yes");
//                 return;
//             }
//             hash.add(arr[i]);
//         }
//         System.out.println("No");
//     }
    
//     public static void main (String[] args) {
//         int[] arr = {1, 4, 45, 6, 10, 8};
//         int n = 16;
//         Pair(arr , n);
//     }
// }

// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// HashMap
class Solution {
      public int[] twoSum(int[] nums, int target) {
          int[] res = new int[2];
          HashMap<Integer , Integer> hm = new HashMap<>();
          
          for(int i = 0 ; i < nums.length ; i++){
              int sum = target - nums[i];
              
              if(hm.containsKey(sum)){
                  res[0] = hm.get(sum);
                  res[1] = i;
                  return res;
              }
              
              hm.put(nums[i] , i);
          }
          
          return res;
      }
  }
