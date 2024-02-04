class Solution {
    public int firstMissingPositive(int[] arr) {
        // cyclic sort
        for(int i = 0; i < arr.length;){
            int correct = arr[i] - 1;
            if(arr[i] > 0 && arr[i] < arr.length && (arr[correct] != arr[i])){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        // getting first missplaced number that index + 1 is missing positive number
        for(int i = 0; i < arr.length; i++){
            if(i != arr[i] - 1){
                return i+1;
            }
        }

        if(arr.length == 1 && arr[0] == 1){
            return 2;
        }
        return arr.length + 1;
    }
}