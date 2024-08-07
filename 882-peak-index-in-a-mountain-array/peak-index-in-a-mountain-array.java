class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = (start + (end - start)/2);
            
            if((mid+1  != nums.length) && nums[mid] < nums[mid+1]){
                start = mid + 1;
            }else if((mid - 1 != -1) && nums[mid] < nums[mid-1]){
                end = mid - 1;
            }else {
                return mid;
            }
        }

        return 0;
    }
    
}