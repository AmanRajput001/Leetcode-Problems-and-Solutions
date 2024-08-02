class Solution {
    public int minSwaps(int[] nums) {
        int totalOnes = 0;
        for (int num : nums) {
            totalOnes += num;
        }

        if (totalOnes == 0 || totalOnes == nums.length) {
            return 0;
        }

        int currentOnes = 0;
        for (int i = 0; i < totalOnes; i++) {
            currentOnes += nums[i];
        }

        int maxOnes = currentOnes;
        for (int i = 1; i < nums.length; i++) {
            currentOnes -= nums[i - 1];
            currentOnes += nums[(i + totalOnes - 1) % nums.length];
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return totalOnes - maxOnes;
    }
}
