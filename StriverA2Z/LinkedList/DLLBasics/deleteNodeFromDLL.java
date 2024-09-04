//Question : https://www.naukri.com/code360/problems/non-head-node-deletion_9719173?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
/****************************************************************

 Following is the class structure of the Node class:

 class Node
 {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 }

 *****************************************************************/


public class Solution {
    public static Node deleteNode(Node head, int k) {
        Node temp = head;
        int cnt=0;
        while(temp!=null){
            cnt+=1;
            if(cnt==k){
                Node prevNode = temp.prev;
                if(temp.next==null){
                    prevNode.next=null;
                    temp.prev=null;
                }else{
                    Node nextNode=temp.next;
                    prevNode.next=nextNode;
                    nextNode.prev=prevNode;
                    temp.next=temp.prev=null;
                }
            }
            temp=temp.next;
            
        }
        return head;
    }
}
