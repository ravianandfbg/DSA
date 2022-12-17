// https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

// Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
// Output: arr2[] is a subset of arr1[]

// Approach 1:
// Time : O(NlogN)
// Space : O(N)

// import java.util.*;

// class Main{
//     public static boolean isSubset(int[] arr1 , int[] arr2){
//         HashSet<Integer> hash = new HashSet<>();
        
//         for(int i = 0 ; i < arr1.length ; i++){
//             if(!hash.contains(arr1[i])){
//                 // if number of arr1 is not in HashSet
//                 // add that number in HashSet
//                 hash.add(arr1[i]);
//             }
//         }
//             // loop to check if all elements
//             //  of arr2 also lies in arr1
            
//             for(int i = 0 ; i < arr2.length ; i++){
//                 if(!hash.contains(arr2[i])){
//                     return false;
//                 }
//             }
        
//         return true;
//     }
    
//     public static void main (String[] args) {
//         int arr1[] = { 11, 1, 13, 21, 3, 7 };
//         int arr2[] = { 11, 3, 7, 1 };
        
//         if(isSubset(arr1 , arr2)){
//             System.out.println("arra2 is subset of arr1");
//         }
//         else{
//             System.out.println("arr2 is not subset of arr1");
//         }
//     }
// }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
// Approach 2:
// Time : O(m + n)
// Space : O(m + n)

// import java.util.*;

// class Main{
//     public static boolean isSubset(int[] arr1 , int[] arr2){
//         HashSet<Integer> hash = new HashSet<>();
        
//         for(int i = 0 ; i < arr1.length ; i++){
//             hash.add(arr1[i]);
//         }
        
//         int hash_size = hash.size();
        
//         for(int i = 0 ; i < arr2.length ; i++){
//             hash.add(arr2[i]);
//         }
        
//         if(hash.size() == hash_size){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
// }

//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
// Approach 3 : HashMap
//Time : O(m + n)
// Space : O(n)

class Main{
      public static boolean isSubset(int[] arr1 , int[] arr2){
          // create frequency hashmap
          HashMap<Integer , Integer> freq = new HashMap<>();
          
          // Increase the frequency of each element
          // in the frequency table.
          for(int i = 0 ; i < arr1.length ; i++){
              freq.put(arr1[i] , freq.getOrDefault(arr1[i] , 0 + 1));
          }
          
          // Decrease the frequency if the
          // element was found in the frequency
          // table with the frequency more than 0.
          // else return 0 and if loop is
          // completed return 1.
          for(int i = 0 ; i < arr2.length ; i++){
              if(freq.getOrDefault(arr2[i] , 0) > 0){
                  freq.put(arr2[i] , freq.get(arr1[i]) - 1);
              }
              else{
                  return false;
              }
          }
          
          return true;
      }
}
