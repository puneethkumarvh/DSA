//iterate over string s1 and see if the current character or the next character make the subsequence of string 2
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while (i < str1.length() && j < str2.length()) {
            char current = str1.charAt(i);
            char nextCyclic = (char) ((current - 'a' + 1) % 26 + 'a');
            
            // Check if current character matches or can be incremented to match str2[j]
            if (current == str2.charAt(j) || nextCyclic == str2.charAt(j)) {
                j++; // Move to next character in str2
            }
            i++; // Always move to next character in str1
        }
        
        return j == str2.length();
    }
}
