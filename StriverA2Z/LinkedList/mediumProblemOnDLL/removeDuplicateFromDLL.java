//Question link : https://www.geeksforgeeks.org/problems/remove-duplicates-from-a-sorted-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=remove-duplicates-from-a-sorted-doubly-linked-list
//code : Time complexity O(N),space complexity is O(1).
//my solution
class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head==null || head.next==null){
            return head;
        }
       Node temp=head.next;
       while(temp!=null){
           Node prev=temp.prev;
           Node front=temp.next;
           if(prev.data==temp.data){
               prev.next=front;
               if(front!=null){
                   front.prev=prev;
               }
           }
           temp=temp.next;
       }
       return head;
        
    }
}
