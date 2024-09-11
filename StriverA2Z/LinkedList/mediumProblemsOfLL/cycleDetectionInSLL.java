//QUestion link : https://www.naukri.com/code360/problems/cycle-detection-in-a-singly-linked-list_628974?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Solution 1 using Hashmap. Time complexity is O(N+1) and space complexity is O(N)
//code 
import java.util.HashMap;

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

public class Solution {

    public static boolean detectCycle(Node head) {
        HashMap<Node,Integer> mpp= new HashMap<>();
        Node temp=head;
        while(temp!=null){
            if(mpp.get(temp)!=null){
                return true;
            }
            mpp.put(temp,1);
            temp=temp.next;
        }
        return false;
        
    }
}





//Solution 2
//Optimal solution using hare and tortoise method.Time complexity is approx O(N) and space complexity is O(1) i.e., no auxillary space used.
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

public class Solution {

    public static boolean detectCycle(Node head) {
        Node hare=head;
        Node tortoise = head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            tortoise=tortoise.next;
            if(hare==tortoise){
                return true;
            }
        }
        return false;
    }
}
