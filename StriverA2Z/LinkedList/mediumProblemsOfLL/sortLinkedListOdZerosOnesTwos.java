//Question Link: https://www.naukri.com/code360/problems/sort-linked-list-of-0s-1s-2s_1071937?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//this can we solved using divide and conquer as we have done for sorting normal linkedlist. But this works in time complexity of O(Nlog(N)) and hence below is the optimal approach.
//optimal approach : Time complexity is O(N) ,space complexity is O(1) 
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
    public static Node sortList(Node head) {
        if(head==null || head.next==null){
			return head;
		}
		Node zeroHead=new Node(-1);
		Node zero=zeroHead;
		Node oneHead=new Node(-1);
		Node one=oneHead;
		Node twoHead= new Node(-1);
		Node two=twoHead;
		Node temp=head;
		while(temp!=null){
			if(temp.data==0){
				zero.next=temp;
				zero=zero.next;
			}
			else if(temp.data==1){
				one.next=temp;
				one=one.next;
			}
			else if(temp.data==2){
				two.next=temp;
				two=two.next;
			}
			temp=temp.next;
		}
		two.next=null;
		zero.next= (oneHead.next==null)?twoHead.next:oneHead.next;
		one.next=twoHead.next;
		return zeroHead.next;
    }
}
