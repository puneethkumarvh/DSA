//Question link : https://leetcode.com/problems/remove-outermost-parentheses/
//code
//O(n) time complexity.
class Solution {
    public String removeOuterParentheses(String s) {
        int count=0;
        StringBuilder result=new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count==0){
                    count+=1;
                }else{
                    count+=1;
                    result.append(s.charAt(i));
                }
            }else {
                count-=1;
                if(count!=0){
                    result.append(s.charAt(i));
                }
            }
        }
        return result.toString();
        
    }
}
