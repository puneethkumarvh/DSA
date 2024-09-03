//Question link : https://www.naukri.com/code360/problems/delete-k-th-node-from-doubly-linked-list_9723679?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
/****************************************************************

 Following is the class structure of the linked list:

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
    public static Node deleteNode(Node head, int k) {
        if(k==1 && head.next!=null){
            Node temp = head;
            head= head.next;
            temp.next=null;
            head.prev=null;
            return head;
        }else if (k==1 && head.next == null){
            return null;
        }
        int cnt = 0;
        Node temp2=head;
        while(temp2!=null){
            cnt+=1;
            if(cnt==k && temp2.next!= null){
                Node prev_temp= temp2.prev;
                Node next_temp= temp2.next;
                prev_temp.next=next_temp;
                next_temp.prev=prev_temp;
                return head;

            }else if(cnt==k){
                Node temp3 = temp2.prev;
                temp3.next=null;
                temp2.prev=null;
                return head;
            }
            temp2=temp2.next;
        }
        return head;
        
    }
}
