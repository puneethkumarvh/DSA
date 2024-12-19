class Solution {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0; // Count of chunks
        int max = 0;    // Maximum value seen so far

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]); // Update the maximum value
            // If max equals the current index, we can form a chunk
            if (max == i) {
                chunks++;
            }
        }
        return chunks;
    }
}
