//Leetcode : 136 . 
//Using HashMap.
//Time complexity : O(2N) 
//Space complexity : O(N/2+1) as all numbers repeat twice except one 
//code 
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i:nums){
            mpp.put(i,mpp.getOrDefault(i,0)+1);
        } 
        for(Map.Entry<Integer,Integer> mp : mpp.entrySet()){
            if(mp.getValue()==1){
                return mp.getKey();
            }
        }
        return -1;
    }
}



//Optimal code using XOR 
//Time complexity : O(N) 
//Space complexity : O(1) 
//code 
class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        for(int i:nums){
            ans ^= i;
        }
        return ans;
    }
}
