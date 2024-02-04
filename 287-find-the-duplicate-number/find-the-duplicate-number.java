class Solution {
    public int findDuplicate(int[] arr) {
        // cyclic sort
        for(int i = 0; i < arr.length;){
            int correct = arr[i] - 1;
            if(arr[correct] == arr[i]){
                i++;
            }else{
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
        }

        //find duplicate
        for(int i = 0; i < arr.length;){
            if(i == arr[i] - 1){
                i++;
            }else{
                return arr[i];
            }
        }

        return -1;
    }
}