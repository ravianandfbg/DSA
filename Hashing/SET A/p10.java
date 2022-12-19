// https://www.geeksforgeeks.org/count-pairs-with-given-sum/

// Input:  arr[] = {1, 5, 7, -1}, sum = 6
// Output:  2
// Explanation: Pairs with sum 6 are (1, 5) and (7, -1).

// Input:  arr[] = {10, 12, 10, 15, -1, 7, 6, 5, 4, 2, 1, 1, 1}, sum = 11
// Output:  9
// Explanation: Pairs with sum 11 are (10, 1), (10, 1), (10, 1), (12, -1), (10, 1), (10, 1), (10, 1), (7, 4), (6, 5).

// Time : O(N)
// Space : O(N)

// import java.util.*;

// class Main{
//     public static int getPairsCount(int[] arr , int n , int sum){
//         HashMap<Integer,Integer> hm = new HashMap<>();
//         for(int i = 0 ; i < n ; i++){
//             if(!hm.containsKey(arr[i])){
//                 // initializing value to 0, if key not found
//                 hm.put(arr[i] , 0);
//             }
            
//             // if key found
//             hm.put(arr[i] , hm.get(arr[i]) + 1);
//         }
        
//         int twice_count = 0;
//         // iterate through each element and increment the
//         // count (Notice that every pair is counted twice)
//         for(int i = 0 ; i < n ; i++){
//             if(hm.get(sum-arr[i]) != null){
//                 twice_count += hm.get(sum - arr[i]);
//             }
//             // if (arr[i], arr[i]) pair satisfies the
//             // condition, then we need to ensure that the
//             // count is decreased by one such that the
//             // (arr[i], arr[i]) pair is not considered
//             if(sum - arr[i] == arr[i]){
//                 twice_count--;
//             }
//         }
//         // return the half of twice_count
//         return twice_count/2;
//     }
    
//     public static void main (String[] args) {
//         int[] arr = {1, 5, 7, -1, 5};
//         int sum = 6;
//         int n = arr.length;
//         System.out.println(getPairsCount(arr , n , sum));
//     }
// }


//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Approach 2 : Again HashMap in single loop

class Main{
      public static int getPairsCount(int[] arr , int n , int sum){
          HashMap<Integer,Integer> hm = new HashMap<>();
          int count = 0;
          for(int i = 0 ; i < n ; i++){
              if(hm.containsKey(sum-arr[i])){
                  count += hm.get(sum - arr[i]);
              }
              if(hm.containsKey(arr[i])){
                  hm.put(arr[i] , hm.get(arr[i]) + 1);
              }
              else{
                  hm.put(arr[i] , 1);
              }
          }
          
          return count;
      }
