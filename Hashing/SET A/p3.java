// https://www.geeksforgeeks.org/minimum-operation-make-elements-equal-array/?ref=lbp

// Input : arr[] = {1, 2, 3, 4}
// Output : 3
// Since all elements are different, 
// we need to perform at least three
// operations to make them same. For
// example, we can make them all 1
// by doing three subtractions. Or make
// them all 3 by doing three additions.

// Time : O(N)
// Space : O(N)

import java.util.*;

class Main{
    public static int minOperation(int[] arr , int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            // put elements and it's frequency in HashMap
            if(hm.containsKey(arr[i])){
                hm.put(arr[i] , hm.get(arr[i]) + 1);
            }
            else{
                hm.put(arr[i] , 1);
            }
        }
        
        // find maximum frequency
        int max_count = 0;
        Set<Integer> hash = hm.keySet();
        for(int i : hash){
            if(max_count < hm.get(i)){
                max_count = hm.get(i);
            }
        }
        
        return (n - max_count);
    }
    
    public static void main (String[] args) {
        int[] arr = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;
        
        System.out.println(minOperation(arr , n));
    }
}

