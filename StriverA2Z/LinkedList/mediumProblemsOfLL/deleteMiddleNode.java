//Question link : https://www.naukri.com/code360/problems/delete-middle-node_763267?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Brute force - Iterate over the nodes and take the count of the nodes,now do floor division of total nodes by 2 and Iterate again to that node and do deletion operation. 
//Time complexity would be O(N) + O(N/2)

//My solution - optimal solution. 
//Time complexity is O(N/2) and space complexity is O(1) . 
//code-this code is using third variable prev. we can we without using third variable also. 
public class Solution {
    public static Node deleteMiddle(Node head) {
        Node slow=head;
        Node fast=head;
        Node prev=null;
        if(head.next==null ){
            return null;
        }
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            slow.next=slow.next.next;
        }
        else{
            prev.next=prev.next.next;
        }
        return head;
    }
}
