// https://www.geeksforgeeks.org/counting-frequencies-of-array-elements/?ref=lbp
// Time : O(N) (using single loop to track hashmap)
// Space : O(N) (due to hashmap)


import java.util.*;
public class Main
{
    public static void countFreq(int[] arr , int n){
        HashMap<Integer , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            if(hm.containsKey(arr[i])){
                // if number is present in HashMap 
                // Increment it's count by 1
                hm.put(arr[i] , hm.get(arr[i]) + 1);
            }
            else{
                // if number is not present in HashMap
                // putting this number to freqMap with 1 as it's value
                hm.put(arr[i] , 1);
            }
        }
        // printing the HashMap
        for(Map.Entry num : hm.entrySet()){
            System.out.println(num.getKey() + " " + num.getValue());
        }
    }
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};
		int n = arr.length;
		countFreq(arr , n);
	}
}

