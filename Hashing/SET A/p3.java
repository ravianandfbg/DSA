// https://www.geeksforgeeks.org/maximum-distance-two-occurrences-element-array/

// Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
// Output: 10
// maximum distance for 2 is 11-1 = 10 
// maximum distance for 1 is 4-2 = 2 
// maximum distance for 4 is 10-5 = 5

// Time : O(N)
// Space : O(N)

import java.util.*;

class Main{
    public static int maxDistance(int[] arr , int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        // Traverse elements and find maximum distance between
        // same occurrences with the help of map.
        
        int max_distance = 0;
        
        for(int i = 0 ; i < n ; i++){
            // If this is first occurrence of element, insert its
            // index in map
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i] , i);
            }
            else{
                // Else update max distance
                max_distance = Math.max(max_distance , i - hm.get(arr[i]));
            }
        }
        
        return max_distance;
    }
    
    public static void main (String[] args) {
        int[] arr = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        int n = arr.length;
        
        System.out.println(maxDistance(arr , n));
    }
}