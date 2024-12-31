//Question link : https://leetcode.com/problems/missing-number/
//Time complexity: O(N) 
//Space complexity : O(N)
//code 
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        for(int i=0;i<=nums.length;i++){
            if(!st.contains(i)){
                return i;
            }
        }
        return 0;
        
    }
}
