//Question : https://www.naukri.com/code360/problems/rearrange-odd-and-even-places_920379?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Brute force is to use a array and copy all elements as needed and then re write the node. Time complexity is O(N/2) + O(N/2) + O(N) and space complexity is O(N) as we need to copy all node's data into array.

//my solution - without using array. 
//Time complexity is O(N)+O(N/2) = O(3N/2) ,space complexity is O(1)
//code 
public class Solution {
    public static Node oddEvenList(Node head) {
        Node lastOdd = head;
        if(lastOdd.next==null || lastOdd.next.next==null){
            return head;
        }
        while(lastOdd.next!=null && lastOdd.next.next!=null){        
            lastOdd=lastOdd.next.next;
        }
        Node lastEven=null;
        if(lastOdd.next!=null){
             lastEven = lastOdd.next;
        }
        Node firstNode=head;
        Node lastNode = lastOdd;
        while(firstNode!=lastOdd){
            Node front= firstNode.next;
            firstNode.next=firstNode.next.next;
            lastNode.next=front;
            lastNode=lastNode.next;
            lastNode.next=null;
            firstNode=firstNode.next;
        }
        if(lastEven!=null){
            lastNode.next=lastEven;
        }
        
        return head; 
        
    }
}


//optimal solution in O(N) time complexity and O(1) space complexity.
public class Solution {
    public static Node oddEvenList(Node head) {
        if(head.next==null || head.next.next==null){
            return head;
        }
        Node oddNode=head;
        Node evenNode=head.next;
        Node evenHead=evenNode;
        while(evenNode.next!=null ){
            oddNode.next=oddNode.next.next;    //O(N/2) time
            oddNode=oddNode.next;
            evenNode.next=evenNode.next.next;  //O(N/2) time
            if(evenNode.next!=null){
              evenNode=evenNode.next;
            }
            
        }
        oddNode.next=evenHead;
        return head;
    }
}
