class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        // Insertion sort
        for (int i = 1; i <= nums.length - 1; i++) {
            for (int j = i; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        */

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                } else {
                    break;
                }
            }
            if (count >= 2) {
                return true;
            }
        }

        return false;
    }
}