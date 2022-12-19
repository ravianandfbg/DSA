// https://www.geeksforgeeks.org/check-given-array-contains-duplicate-elements-within-k-distance/?ref=lbp

// Input: k = 3, arr[] = {1, 2, 3, 4, 1, 2, 3, 4}
// Output: false
// All duplicates are more than k distance away.

// Input: k = 3, arr[] = {1, 2, 3, 1, 4, 5}
// Output: true
// 1 is repeated at distance 3.

// Input: k = 3, arr[] = {1, 2, 3, 4, 5}
// Output: false

// Input: k = 3, arr[] = {1, 2, 3, 4, 4}
// Output: true

import java.util.*;

class Main{
    public static boolean checkDuplicatesWithinK(int[] arr , int n, int k){
       HashSet<Integer> hash = new HashSet<>();
       
       for(int i = 0 ; i < n ; i++){
           // If already present n hash, then we found
            // a duplicate within k distance
           if(hash.contains(arr[i])){
               return true;
           }
           else{
               // Add this item to hashset
               hash.add(arr[i]);
           }
           
           // Remove the k+1 distant item
           if(i >= k){
               hash.remove(arr[i-k]);
           }
       }
       
       return false;
    }
    
    public static void main (String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int k = 3;
        int n = arr.length;
        
        if(checkDuplicatesWithinK(arr , n , k))
        System.out.println("Yes");
        
        else
        System.out.println("No");
    }
}