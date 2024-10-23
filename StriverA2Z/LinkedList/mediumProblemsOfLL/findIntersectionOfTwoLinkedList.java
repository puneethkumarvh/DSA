//Question link : https://www.naukri.com/code360/problems/-intersection-of-two-linked-lists_630457?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Brute force and my approach 
//Time complexity is O(N) and space complexity is O(N)
//code 
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        if(firstHead==null || secondHead==null){
            return 0;
        }
        HashMap<Node,Integer> mpp=new HashMap<>();
        Node first=firstHead;
        Node second=secondHead;
        while(first!=null){
            mpp.put(first,mpp.getOrDefault(first,0)+1);
            first=first.next;
            }
        while(second!=null){
            if(mpp.containsKey(second)){
                return second.data;
            }
            second=second.next;
        }
        return 0;
    }
}

//optimal solution
//Time Complexity: O(2*max(length of list1,length of list2)) as we are iterating same link twice .
public class Solution {
    public static int findIntersection(Node firstHead, Node secondHead) {
        Node d1=firstHead;
        Node d2 = secondHead;
        while(d1!=d2){
            if(d1==null){
                d1=secondHead;
            }else{
                d1=d1.next;
            }
            if(d2==null){
                d2=firstHead;
            }else{
                d2=d2.next;
            }
        }
        return d1.data;

    }
}
