class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            /*
             * // Approach 1:
             * 
             * if(n % 2 != 0){
             * return false; // odd number
             * }
             * 
             * for (int i = 2; i <= n && i != 0; i *= 2) {
             * if (i == n) {
             * return true;
             * }
             * }
             * 
             * return false;
             */

            // Approach 2: Using recursion

            return n % 2 == 0 && isPowerOfTwo(n / 2);
        }
    }
}