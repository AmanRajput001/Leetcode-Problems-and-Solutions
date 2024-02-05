class Solution {
    public int majorityElement(int[] nums) {
        

        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int m = i+1; m < nums.length;m++){
                if(nums[m] == nums[i]){
                    count++;
                }else if(count == (nums.length/2 + 1) && nums[m] != nums[i]){
                    break;
                }
            }

            if(count == (nums.length/2 + 1)){
                return nums[i];
            }
        }

        return -1;
    }
}