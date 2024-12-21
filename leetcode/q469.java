//Solution 1 : My solution 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack<>();
        int[] result=new int[nums1.length];
        for(int i=0;i<result.length;i++){
            result[i]=-1;
        }
        for(int j=0;j<nums2.length;j++){
            while(st.isEmpty()==false && nums2[st.peek()] <= nums2[j]){
                boolean popped=true;
                for(int k=0;k<result.length;k++){
                    if(nums2[st.peek()]==nums1[k]){
                        result[k]=nums2[j];
                        st.pop();
                        popped=false;
                        break;
                    }
                }
                if(popped){
                    st.pop();
                }
            }
            st.add(j);
        }
        return result;
        
    }
}



//Solution 2 : chatgpt solution 
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         // Map to store the next greater element for each number in nums2
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Traverse nums2 and compute next greater elements
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                map.put(stack.pop(), num); // Map the smaller number to its next greater number
            }
            stack.push(num);
        }
        
        // If no next greater element exists, map it to -1
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // Build the result for nums1 using the map
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}
