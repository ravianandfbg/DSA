// https://www.geeksforgeeks.org/find-whether-an-array-is-subset-of-another-array-set-1/

// Input: arr1[] = {11, 1, 13, 21, 3, 7}, arr2[] = {11, 3, 7, 1} 
// Output: arr2[] is a subset of arr1[]

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
// Time : O()
// Space : O(N)
