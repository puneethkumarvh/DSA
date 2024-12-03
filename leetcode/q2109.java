//Iterate over each character of a given string and append it to a empty string(result).if string index is same as index mentioned in spaces,append space to the resultant string and continue till end.
//use string builder to append easily.
//we can use string ranges here by altering the given string when iterating over spaces, but it is expensive operation. 

import java.util.*;
class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder res=new StringBuilder();
        int space_ind=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(space_ind < spaces.length && spaces[space_ind]==i){
                res.append(' ');
                space_ind++;
            }
            res.append(ch);
        }
        return res.toString();
        
    }
}
