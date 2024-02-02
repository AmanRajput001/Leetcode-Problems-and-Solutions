class Solution {
    /*
     * public boolean search(int[] nums, int target) {
     * Arrays.sort(nums);
     * 
     * int start = 0;
     * int end = nums.length - 1;
     * while (start <= end) {
     * int mid = (start + (end - start) / 2);
     * 
     * if (target < nums[mid]) {
     * end = mid - 1;
     * } else if (target > nums[mid]) {
     * start = mid + 1;
     * } else {
     * return true;
     * }
     * }
     * 
     * return false;
     * }
     */

    public boolean search(int[] nums, int target) {
        int index_pivot = -1;
        if (nums.length == 1) {
            index_pivot = 0;
        }else if(nums.length == 2){
            if(nums[1] > nums[0]){
                index_pivot = 1;
            }else{
                index_pivot = 0;
            }
        }
        else{
            index_pivot = getPivot(nums);
        }

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
                return true;
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
                return true;
            }
        }
        return false;
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
            if (nums[start] == nums[mid] && nums[end] == nums[mid]) {
                if ( (start + 1 != nums.length) && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if ((end - 1 != -1) && nums[end] < nums[end - 1] ) {
                    return end - 1;
                }
                end--;
            }else if ((nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[end] < nums[mid]))) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }
}