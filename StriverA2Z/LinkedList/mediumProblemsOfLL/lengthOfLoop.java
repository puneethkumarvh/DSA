//
//Brute force approach.
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
 };

 *****************************************************************/

public class Solution
{
    public static int lengthOfLoop(Node head) {
        HashMap<Node,Integer> mpp = new HashMap<>();
        int timer = 0;
        Node temp=head;
        while(temp!=null ){
            if(mpp.get(temp)!=null){
                return timer-mpp.get(temp)+1;
            }
            timer +=1;
            mpp.put(temp,timer);
            temp=temp.next;

        }
        return 0;

        
    }
}








//Optimal solution using hare and tortoise method.
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

public class Solution
{
    public static int lengthOfLoop(Node head) {
        Node hare= head;
        Node tortoise = head;
        while(hare!=null && hare.next!=null){
            hare=hare.next.next;
            tortoise=tortoise.next;
            if(hare==tortoise){
                int len=1;
                tortoise=tortoise.next;
                while(hare!=tortoise){
                    len+=1;
                    tortoise=tortoise.next;
                }
                return len;
            }

        }
        return 0;
    }
}
