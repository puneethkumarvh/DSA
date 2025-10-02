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
    /**
     * Searches for a given value in a linked list
     * @param head - The head node of the linked list
     * @param k - The value to search for
     * @return 1 if the value is found, 0 if not found
     * 
     * Time Complexity: O(n) where n is the number of nodes in the linked list
     * Space Complexity: O(1) as we only use a constant amount of extra space
     */
    public static int searchInLinkedList(Node head, int k)
    {
        // Traverse through the linked list until we reach the end
        while(head!=null){
            // Check if current node contains the target value
            if(head.data == k){
                return 1; // Value found
            }
            head=head.next; // Move to the next node
        }
        return 0; // Value not found in the entire list
    }
}
