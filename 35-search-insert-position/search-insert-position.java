class Solution {
    public int searchInsert(int[] nums, int target) {
        /*
         * int start = 0;
         * int end = nums.length - 1;
         * 
         * while(start <= end){
         * int mid = (start + (end -start)/2);
         * 
         * if(target < nums[mid]){
         * end = mid -1;
         * }else if(target > nums[mid]){
         * start = mid + 1;
         * }else{
         * return mid;
         * }
         * }
         * return start;
         */

        return binarySearch(0, nums.length - 1, target, nums);

    }

    static int binarySearch(int start, int end, int target, int[] arr) {

        int mid = (start + (end - start) / 2);

        if (start <= end) {
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            return binarySearch(start, end, target, arr);
        } else {
            return start;
        }
    }
}