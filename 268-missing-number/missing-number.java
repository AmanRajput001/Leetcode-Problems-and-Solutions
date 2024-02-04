// Amazon Question 

class Solution {
    public int missingNumber(int[] arr) {
        /* 
        //Cyclic sort
        for (int i = 0; i < arr.length;) {
            int correct_index = arr[i];

            if (i == correct_index || correct_index == arr.length) {
                i++;
            } else {
                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
            }
        }*/

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (i == arr[i]) {
                // continue
            } else {
                return i;
            }
        }
        return arr.length;
    }
}