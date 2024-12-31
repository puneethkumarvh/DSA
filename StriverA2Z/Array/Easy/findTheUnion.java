//Question link : https://www.naukri.com/code360/problems/sorted-array_6613259?utm_source=youtube&utm_medium=affiliate&utm_campaign=striver_Arrayproblems&leftPanelTabValue=PROBLEM
//Time complexity : O(n1log N)+O(n2log N)+O(n1+n2)
//Space complexity : O(n1+n2) in worst case.
//code 
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        TreeSet<Integer> st= new TreeSet<>();
        for(int i:a){
            st.add(i);
        }
        for(int j:b){
            st.add(j);
        }
        List<Integer> arr= new ArrayList<>();
        for(int k:st){
            arr.add(k);
        }
        return arr;
    }
}
