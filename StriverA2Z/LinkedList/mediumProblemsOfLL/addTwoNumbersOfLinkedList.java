//Question link :https://www.naukri.com/code360/problems/add-two-numbers_1170520?utm_source=youtube&utm_medium=affiliate&utm_campaign=Codestudio_Linkedlistseries&leftPanelTabValue=PROBLEM
//Time complexity : O(N+M), Space complexity is O(1).
//my solution - a lot of code duplication.
//code
import java.util.* ;

import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

    class LinkedListNode {
        int data;
        LinkedListNode next;
        
        public LinkedListNode(int data) {
            this.data = data;
        }
    }

*****************************************************************/


public class Solution {
    static LinkedListNode addTwoNumbers(LinkedListNode head1, LinkedListNode head2) {
        LinkedListNode newNode=new LinkedListNode(-1);
        LinkedListNode temp1=head1;
        LinkedListNode temp2=head2;
        LinkedListNode temp=newNode;
        int carry=-1;
        while(temp1!=null && temp2!=null){
            int num=0;
            if(carry==-1){
                num=temp1.data+temp2.data;
            }else{
                num=temp1.data+temp2.data+carry;
            }
            if(num>9){
                int result = num%10;
                temp.next=new LinkedListNode(result);
                carry=num/10;
                num=0;
            }else{
                temp.next=new LinkedListNode(num);
                carry=-1;
                num=0;
            }
            temp=temp.next;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        while(temp1!=null){
            int num=0;
            if(carry==-1){
                num=temp1.data;
            }else{
                num=temp1.data+carry;
            }
            if(num>9){
                int result = num%10;
                temp.next=new LinkedListNode(result);
                carry=num/10;
                num=0;
            }else{
                temp.next=new LinkedListNode(num);
                carry=-1;
                num=0;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        while(temp2!=null){
            int num=0;
            if(carry==-1){
                num=temp2.data;
            }else{
                num=temp2.data+carry;
            }
            if(num>9){
                int result = num%10;
                temp.next=new LinkedListNode(result);
                carry=num/10;
                num=0;
            }else{
                temp.next=new LinkedListNode(num);
                carry=-1;
                num=0;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
        if(carry!=-1){
            temp.next=new LinkedListNode(carry);
        }

        return newNode.next;

    }
}
