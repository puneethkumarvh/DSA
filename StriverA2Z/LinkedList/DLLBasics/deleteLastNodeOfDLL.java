//Question : https://www.naukri.com/code360/problems/delete-last-node-of-a-doubly-linked-list_8160469?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//code 
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
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

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node deleteLastNode(Node head) {
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prevNode = temp.prev;
        prevNode.next=null;
        temp.prev=null;
        return head;
    }
}
