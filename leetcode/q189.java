//189. Rotate Array
//code- my approach - using another array of size k. 
//Time complexity is O(N+k). Space complexity is O(K).
class Solution {
    public void rotate(int[] nums, int k) {
        int dummy[]=new int[k];
        int n=nums.length;
        k=k%n;  //minimize the k if it exceeds n as transforming array m times is same as original array.
        if (n<k){
            return ;
        }
        for(int i=0;i<k;i++){
            dummy[i]=nums[n-k+i];
        }
        for(int i=0;i<n-k;i++){
            nums[n-i-1]=nums[n-k-1-i];
        }
        for(int i=0;i<k;i++){
            nums[i]=dummy[i];
        }
        return ;
    }
}
