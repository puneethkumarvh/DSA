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


//Optimal solution - Time complexity is O(N) 
//here we first move the fast pointer for (k+1)th node and then we move slow and fast pointer until last node is reached.Now where slow pointer is present,it will ne the node which we require to connect to the next to next node.
public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        if(head.next==null){
            return null;
        }
        Node fast=head;
        for(int i=1;i<=K;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        Node slow=head;
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}
