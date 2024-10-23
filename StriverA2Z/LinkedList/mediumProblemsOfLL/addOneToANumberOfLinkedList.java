//Question link : https://www.naukri.com/code360/problems/add-one-to-a-number-represented-as-linked-list_920557?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Time complexity is O(N) to reverse a list + O(N+1) in worst case if we add 1 more node + O(N) to reverse again ~ O(3N).
//Space complexity is O(1) 
//code 
public class Solution {

	public static Node reverseList(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node prev=null;
		Node current=head;
		while(current!=null){
			Node front=current.next;
			current.next=prev;
			prev=current;
			current=front;
		}
		return prev;

	}
	public static Node addOne(Node head) {
		Node tempHead= reverseList(head);
		Node temp=tempHead;
		int carry=1;
		while(temp!=null && carry==1){
			temp.data= temp.data+carry;
			if(temp.data==10){
				temp.data=0;
				if(temp.next!=null){
					carry =1;
					temp=temp.next;
				}else{
					Node newNode=new Node(1);
					temp.next=newNode;
					temp=temp.next;
					carry=0;
				}
				
			}else{
				carry=0;
			}
		}
		return reverseList(tempHead);
	}
}

//recursive solution 
//code 
public class Solution {
	public static int addNum(Node temp){
		if(temp==null){
			return 1;
		}
		int carry=addNum(temp.next);
		temp.data=temp.data+carry;
		if(temp.data==10){
			temp.data=0;
			return 1;
		}else{
			return 0;
		}

	}
	public static Node addOne(Node head) {
		int carry=addNum(head);
		if(carry==1){
			Node first=new Node(1);
			first.next=head;
			return first;
		}
		return head;
	}
}
