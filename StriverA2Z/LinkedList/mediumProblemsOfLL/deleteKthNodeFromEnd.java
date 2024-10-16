//Question link : https://www.naukri.com/code360/problems/delete-kth-node-from-end_799912?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//My approach : Time complexity is O(2N) in worst case and O(N) in best case. Space complexity is O(1)
//code
public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        if(head.next==null){
            return null;
        }
        int totalNodes=0;
        Node temp=head;
        while(temp!=null){
            totalNodes++;
            temp=temp.next;
        }
        temp=head;
        int i=1;
        int req=totalNodes-K+1;
        if(req==1){
            head=head.next;
            return head;
        }
        Node prev=null;
        while(i!=req){
            prev=temp;
            temp=temp.next;
            i++;
        }
        prev.next=temp.next;
        return head;
    }
}
