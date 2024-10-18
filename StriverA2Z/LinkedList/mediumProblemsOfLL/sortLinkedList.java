//Question link : https://www.naukri.com/code360/problems/sort-linked-list_920517?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
//Brute force approach- by storing the data of all nodes in array list and the sorting it and then re writing the node list as in arraylist.
//time complexity is O(N) to copy into the code +Sorting time depending on the algorithm +O(N) to re write again. 
//space complexity is O(N) for storing all the nodes in arraylist.
//code 
public class Solution {
	public static Node sortLL(Node head) {
		ArrayList<Integer> arr=new ArrayList<>();
		Node temp = head;
		while(temp!=null){
			arr.add(temp.data);
			temp=temp.next;
		}
		Collections.sort(arr);
		temp=head;
		int i=0;
		while(temp!=null){
			temp.data=arr.get(i);
			temp=temp.next;
			i++;
		}
		return head;
	}
}

//Optimal solution 
//Time complexity : O(N log N)where N is the number of nodes in the linked list. Finding the middle node of the linked list requires traversing it linearly taking O(N) time complexity and to reach the individual nodes of the list, it has to be split log N times (continuously halve the list until we have individual elements).
//Space Complexity : O(1) as no additional data structures or space is allocated for storage during the merging process. However, space proportional to O(log N) stack space is required for the recursive calls. THe maximum recursion depth of log N height is occupied on the call stack.
//code 
import java.util.* ;
import java.io.*; 
/*************************************************************

	Following is the class structure of the Node class:

    class Node {
		public int data;
		public Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
	  	}
    }

*************************************************************/

public class Solution {
	public static Node sortLL(Node head) {
		if(head==null || head.next==null){
			return head;
		}
		Node middleNode= findMiddleNode(head);
		Node leftNode = head;
		Node rightNode = middleNode.next;
		middleNode.next=null;
		Node left=sortLL(leftNode);
		Node right = sortLL(rightNode);

		return mergeTwoLists(left,right);
	}
	public static Node findMiddleNode(Node head){
		if(head==null || head.next==null){
			return head;
		}
		Node slow=head;
		Node fast=head.next;
		while(fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node mergeTwoLists(Node list1,Node list2){
		Node dummyNode=new Node(-1);
		Node temp=dummyNode;
		while(list1!=null && list2!=null){
			if(list1.data<=list2.data){
				temp.next=list1;
				list1=list1.next;
			}else{
				temp.next=list2;
				list2=list2.next;
			}
			temp=temp.next;
		}
		if(list1!=null){
			temp.next=list1;
		}else{
			temp.next=list2;
		}
		return dummyNode.next;
	}
}
