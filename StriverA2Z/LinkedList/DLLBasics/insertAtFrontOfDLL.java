//Question : https://www.naukri.com/code360/problems/insert-at-the-front-of-a-doubly-linked-list_9697366?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//code 
/****************************************************************

 Following is the class structure of the Node class:

 class Node
 {
     public int value;
     public Node next;
     public Node prev;

     Node()
     {
         this.value = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int value)
     {
         this.value = value;
         this.next = null;
         this.prev = null;
     }

     Node(int value, Node next, Node prev)
     {
         this.value = value;
         this.next = next;
         this.prev = prev;
     }
 }

 *****************************************************************/


public class Solution {
    public static Node insertAtFront(Node head, int k) {
       Node temp=new Node(k);
       temp.next=head;
       temp.prev=null;
       head=temp;
       return head;
    }
}
