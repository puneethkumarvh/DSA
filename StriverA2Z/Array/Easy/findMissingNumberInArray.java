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

//Optimal solution 1: Using XOR function. 
//code- Time complexity is O(N) space complexity is O(1).
class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0;
        int xor2=0;
        for(int i=0;i<nums.length;i++){
            xor1=xor1^i;
            xor2=xor2^nums[i];
        }
        xor1=xor1^nums.length;
        return xor1 ^ xor2;
        
    }
}

//optimal solution 2 : Using sum of n natural numbers formula.
//code . Time complexity is O(N) space complexity is O(1).
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = n*(n+1)/2;
        int cal_sum=0;
        for(int i:nums){
            cal_sum += i;
        }
        return sum-cal_sum;  
    }
}
