//QUestion : https://www.naukri.com/code360/problems/insert-at-end-of-doubly-linked-list_8160464?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//code 
****************************************************************************
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
    public static Node insertAtTail(Node list, int K) {
        if(list==null){
            return new Node(K);
        }
        Node temp=list;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node tail = new Node(K);
        tail.prev=temp;
        temp.next=tail;
        return list;
        
    }
}
