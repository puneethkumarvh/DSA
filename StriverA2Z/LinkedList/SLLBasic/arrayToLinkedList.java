//Question : https://www.naukri.com/code360/problems/introduction-to-linked-list_8144737?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//code 
/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node constructLL(int []arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1;i<arr.length; i++){
            Node new_next = new Node(arr[i]);
            temp.next=new_next;
            temp=temp.next;
        }
        return head;
    }
}
