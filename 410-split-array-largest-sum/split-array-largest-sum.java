class Solution {
    public int splitArray(int[] arr, int k) {

        int start = -1;
        int end = 0;

        for(int i = 0; i < arr.length; i++){
            start = Math.max(start,arr[i]);
            end += arr[i];
        }

        while(start < end){
            int mid = (start + (end - start)/2);
            int sum = 0;
            int p = 1;

            for(int num: arr){
                if(sum + num > mid){
                    sum = num;
                    p++;
                }else{
                    sum += num;
                }
            }
            if(p <= k){
                end = mid;
            }else{
                start = mid + 1;
            }
        }

        return start;
    }
}