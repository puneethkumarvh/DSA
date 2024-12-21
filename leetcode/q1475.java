//Iterate over an array and find the next element as per given condition.
//O(2N)  time complexity and constant space complexity.
class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i=0;i<=n-2;i++){
            for(int j=i+1;j<n;j++){
                if(prices[j]<=prices[i]){
                    prices[i]=prices[i]-prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}


//Solution 2 : Runs in O(N) time complexity using monotonous stack and using O(N) space complexity in worst case.
//Kindly refer this video for monotonous stack concept: https://www.youtube.com/watch?v=ALJJcA1uWmU
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] result = prices.clone();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(st.isEmpty()==false && prices[st.peek()] >= prices[i] ){
                result[st.pop()]-=prices[i];
            }
            st.add(i);
        }
        return result;
        
    }
}
