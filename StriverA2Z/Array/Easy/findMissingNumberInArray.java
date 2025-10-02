//Question link : https://leetcode.com/problems/missing-number/
//Problem: Given an array nums containing n distinct numbers in the range [0, n], 
//return the only number in the range that is missing from the array.
//Time complexity: O(N) 
//Space complexity : O(N)
//Approach: Use HashSet to store all numbers, then iterate through [0,n] to find missing number
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
//XOR approach explanation: XOR has the property that a^a = 0 and a^0 = a
//We XOR all numbers from 0 to n (including n) with all numbers in the array
//Since all numbers except the missing one appear twice, they cancel out (a^a=0)
//Only the missing number remains as it appears only once
class Solution {
    public int missingNumber(int[] nums) {
        int xor1=0; // Will store XOR of all numbers from 0 to n
        int xor2=0; // Will store XOR of all numbers in the array
        for(int i=0;i<nums.length;i++){
            xor1=xor1^i;        // XOR with numbers 0 to n-1
            xor2=xor2^nums[i];  // XOR with array elements
        }
        xor1=xor1^nums.length;  // XOR with n (the last number in range [0,n])
        return xor1 ^ xor2;     // XOR the two results to get missing number
        
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
