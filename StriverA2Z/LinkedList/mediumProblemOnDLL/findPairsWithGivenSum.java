//Question link :  https://www.geeksforgeeks.org/problems/find-pairs-with-given-sum-in-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=find-pairs-with-given-sum-in-doubly-linked-list
//code ,Time complexity : O(N*N)
//Brute force method.
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();        
        Node temp1 = head, temp2 = head;
        
       // Outer loop to traverse the linked list
        while (temp1 != null) {
            
            temp2= temp1.next;
            // Inner loop to find pairs
            while(temp2!=null && temp1.data + temp2.data<=target){
                
                if(temp1.data+temp2.data==target){
                    // Create a new pair list
                ArrayList<Integer> list = new ArrayList<>();
                list.add(temp1.data); // Add first element to the pair
                list.add(temp2.data); // Add second element to the pair                     
                result.add(list); // Add the pair to the result list
                }
               
                temp2 = temp2.next;
                
            }
            temp1 = temp1.next;
        }
        // Return the list of pairs with given sum
        return result;
    }
}

//Optimal solution ,time complexity is O(2N)
class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
        
        if (head == null) return pairs; // Handle empty list case

        Node left = head;
        Node right = head;

        // Move right pointer to the end of the list
        while (right.next != null) {
            right = right.next;
        }

        // Two-pointer approach
        while (left != null && right != null && left != right && left.prev != right) {
            int currentSum = left.data + right.data;

            if (currentSum == target) {
                pairs.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
                left = left.next; // Move left pointer right
                right = right.prev; // Move right pointer left
            } else if (currentSum < target) {
                left = left.next; // Increase sum by moving left pointer right
            } else {
                right = right.prev; // Decrease sum by moving right pointer left
            }
        }

        return pairs; // Return found pairs
       }
}
        
