class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        
        for (int i = 0; i < n;) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (!(nums[j] == nums[i])) {
                    break;
                }
                count++;
            }

            if (count > n / 3) {
                list.add(nums[i]);
                i += count;
            } else {
                i++;
            }
        }

        return list;
    }
}