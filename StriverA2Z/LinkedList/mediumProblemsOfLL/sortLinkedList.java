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

