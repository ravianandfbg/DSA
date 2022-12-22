// https://www-geeksforgeeks-org.cdn.ampproject.org/v/s/www.geeksforgeeks.org/number-subarrays-sum-exactly-equal-k/amp/?amp_js_v=a6&amp_gsa=1&usqp=mq331AQKKAFQArABIIACAw%3D%3D#aoh=16470976960317&referrer=https%3A%2F%2Fwww.google.com&amp_tf=From%20%251%24s&ampshare=https%3A%2F%2Fwww.geeksforgeeks.org%2Fnumber-subarrays-sum-exactly-equal-k%2F
// Leetcode 560
// Pepcoding(HashMap Level 2 - Q9) -> https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-apr-19-2021/hashmap-and-heap-level-2/count-of-subarrays-having-sum-equals-to-k-official/ojquestion

// Input : arr[] = {10, 2, -2, -20, 10}, k = -10
// Output : 3
// Explanation: Subarrays: arr[0…3], arr[1…4], arr[3..4] have a sum exactly equal to -10.

// Input : arr[] = {9, 4, 20, 3, 10, 5}, k = 33
// Output : 2
// Explanation: Subarrays : arr[0…2], arr[2…4] have a sum exactly equal to 33.

// Time : O(N)
// Space: O(N)

class Solution {
      public int subarraySum(int[] nums, int k) {
          HashMap<Integer,Integer> map = new HashMap<>();
          map.put(0 , 1);
          
          int ps = 0; // ps : prefix sum
          int count = 0;
          
          for(int i = 0 ; i < nums.length ; i++){
              ps += nums[i];
              
              if(map.containsKey(ps - k) == true){
                  int oFreq = map.get(ps - k); // oFreq : old frequency
                  count += oFreq;
              }
              int nFreq = map.getOrDefault(ps , 0 ) + 1; // nFreq : new Frequency
              map.put(ps , nFreq);
          }
          
          return count;
      }
  }