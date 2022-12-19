// https://leetcode.com/problems/first-unique-character-in-a-string/

// Example 1:
// Input: s = "leetcode"
// Output: 0

// Example 2:
// Input: s = "loveleetcode"
// Output: 2

// Time : O(N)
// Space : O(N)

class Solution {
      public int firstUniqChar(String s) {
          HashMap<Character,Integer> hm = new HashMap<>();
          for(int i = 0 ; i < s.length() ; i++){
              //Creating a hashmap which will take every character and its occurrence(frequency)
              hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
          }
          
          for(int i = 0 ; i < s.length() ; i++){
              if(hm.get(s.charAt(i)) == 1){
                  return i;
              }
          }
          
          return -1;
      }
  }