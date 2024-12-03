//Iterate over an array and see if an element that satisfy the given condition to given element is present in set. If present return true else return false.
//first we check if multiplication of 2 of element is present. if not we check if half of it is present.
import java.util.*;
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i:arr){
            if(hs.contains(i*2) || ((i%2==0)&& hs.contains(i/2))){
                return true;
            }else{
                hs.add(i);
            }
        }
        return false;
    }
}
