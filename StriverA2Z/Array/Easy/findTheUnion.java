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

//Solution 2: Time complexity : O(n+m) ,Space complexity : O(1) as no extra storage is used,arraylist is used to get return the answer but not solve it.
//code 
import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        int n=a.length;
        int m=b.length;
        ArrayList<Integer> arr=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j < m){
            if(a[i]<=b[j]){
                if(arr.isEmpty() || (arr.get(arr.size()-1)!=a[i]) ){
                    arr.add(a[i]);
                }
                i++;
                
            }else{
                if(arr.isEmpty() || (arr.get(arr.size()-1)!=b[j]) ){
                    arr.add(b[j]);
                }
                j++;

            }
        }
        while(i<n){
            if(arr.isEmpty() || (arr.get(arr.size()-1)!=a[i]) ){
                    arr.add(a[i]);
                }
                i++;
        }
        while(j<m){
            if(arr.isEmpty() || (arr.get(arr.size()-1)!=b[j]) ){
                    arr.add(b[j]);
                }
                j++;
        }

        return arr;
    }
}
