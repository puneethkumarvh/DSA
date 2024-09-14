//Question link : https://www.naukri.com/code360/problems/linked-list-cycle-ii_1112628?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Using Hash map : Time complexity is O(N + 2 (time to insert and find node into map)) ,space complexity is O(N)
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
    public static Node firstNode(Node head) {
        HashMap<Node,Integer> mpp=new HashMap<>();
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(mpp.get(temp) !=null){
                return temp;
            }
            mpp.put(temp,1);
            temp=temp.next;

        }
        return null;
        
        
    }
}


//Optimal code using Hare and Tortoise Algorithm. 
//Time complexity is O(N + N/2) ,Space complexity is O(1) no extra space is used.
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
    public static Node firstNode(Node head) {
        Node hare=head;
        Node tortoise = head;
        while(hare!=null && hare.next != null){
            hare = hare.next.next;
            tortoise = tortoise.next;
            while(hare == tortoise){
                hare= head;
                while(hare != tortoise){
                    hare = hare.next;
                    tortoise=tortoise.next;
                }
                return hare;
            }
        }
        return null;
    }
}
