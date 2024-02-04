class Solution {
    public int firstMissingPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length ; i++){
            if((arr[i] > 0)){
                if(min > arr[i]){
                    min = arr[i];
                }
            }
        }
        
        if(min != 1){
            return 1;
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] > 0)) {
                if (!(arr[i + 1] == arr[i] + 1 || arr[i+1] == arr[i])) {
                    return arr[i] + 1;
                }
            }
        }

        if(arr[arr.length - 1] <= 0){
            return 1;
        }else{
            return arr[arr.length - 1] + 1;
        }
    }
}