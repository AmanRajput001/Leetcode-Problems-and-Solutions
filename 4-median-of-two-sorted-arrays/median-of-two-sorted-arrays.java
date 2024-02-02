class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;
        int []ar = new int[len];
        int i = 0;
        for(; i < nums1.length; i++){
            ar[i] = nums1[i];
        }

        for(int j = 0; j < nums2.length; j++){
            ar[i] = nums2[j];
            i++;
        }

        // Bubble sort
        for(i = 0; i < len; i++){
            for(int j = 0; j < len-1; j++){
                if(ar[j] > ar[j+1]){
                    int temp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = temp;
                }
            }
        }

        len = len -1;

        if(len % 2 == 0){
            return ar[len/2];
        }else{
            int sum = (ar[len/2]) + (ar[len/2 + 1]);
            return (double)(sum)/2;
        }
        
    }
}