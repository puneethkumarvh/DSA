//Question link : https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//Time complexity is : O(N) and space complexity is O(1) 
//Logic : Take two pointers in zeroth and first position,move second pointer until it finds different element than ith pointer element and assign new element to (i+1)th position and increment i pointer.
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}
