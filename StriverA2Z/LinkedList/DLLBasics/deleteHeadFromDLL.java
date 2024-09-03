//Delete Head of a Doubly Linked List
//Question : https://www.naukri.com/code360/problems/insert-before-the-given-node-of-a-doubly-linked-list_9719100?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//code 

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

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/


public class Solution {
    public static Node deleteHead(Node head) {
        if(head==null || head.next==null){
            return null;
        }
       Node temp = head;
       head=head.next;
       temp.next=null;
       head.prev=null;
       return head;
    }
}
