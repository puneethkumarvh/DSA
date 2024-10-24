//Question link : https://www.naukri.com/code360/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=SUBMISSION
//Time complexity is O(N) and space complexity is O(1) 
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
 }

 *****************************************************************/

public class Solution {
    public static Node deleteAllOccurrences(Node head, int k) {
        while(head!=null && head.data==k){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
        }
        Node current=head;
        while(current!=null){
            Node prev=current.prev;
            Node front=current.next;
            if(current.data==k){
                if(prev!=null){
                    prev.next=front;
                }
                if(front!=null){
                    front.prev=prev;
                }
                current=current.next;
            }else{
                current=current.next;
            }
        }
        return head;

    }
}
