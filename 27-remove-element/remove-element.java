class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val) {
                count++;

               //System.out.println(i + " " + count);
                for (int j = i; j < nums.length - count; j++) {
                    nums[j] = nums[j + 1];
                }

                if(i == nums.length - count){
                    break;
                }

            } else {
                i++;
            }
        }

        return nums.length - count;
    }
}