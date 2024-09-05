//Question : https://www.naukri.com/code360/problems/middle-of-linked-list_973250?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Optimal code using hare and tortoise method. 
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
    public static Node findMiddle(Node head)
    {
        Node hare=head;
        Node tortoise=head;
        while(hare!=null && hare.next!=null){
            tortoise=tortoise.next;
            hare=hare.next.next;
        }
        return tortoise;
    }
}
