class Solution {
    public int search(int[] nums, int target) {
        int index_pivot = getPivot(nums);

        if (index_pivot == -1) {
            index_pivot = nums.length - 1;

        }
        int start = 0;
        int end = index_pivot;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        start = index_pivot + 1;
        end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int getPivot(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if ((mid + 1 != nums.length) && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if ((mid - 1 != -1) && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[start] >= nums[mid]) {
                end = mid - 1;
            } else if (nums[start] < nums[mid]) {
                start = mid + 1;
            }
        }

        return -1;

    }
}