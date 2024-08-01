//Question link: https://www.naukri.com/code360/problems/search-in-a-linked-list_975381?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
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
 }

 *****************************************************************/


public class Solution
{
    public static int searchInLinkedList(Node head, int k)
    {
        while(head!=null){
            if(head.data == k){
                return 1;
            }
            head=head.next;
        }
        return 0;
    }
}
