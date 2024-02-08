class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        } else {
            if(n % 2 != 0){
                return false; // odd number
            }

            for (int i = 2; i <= n && i != 0; i *= 2) {
                if (i == n) {
                    return true;
                }
            }

            return false;
        }
    }
}