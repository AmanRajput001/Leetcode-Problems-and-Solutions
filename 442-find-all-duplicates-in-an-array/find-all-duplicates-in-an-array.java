class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        //cyclic sort
        for(int i = 0; i < arr.length;){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }else{
                i++;
            }
        }

        List<Integer> ls = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(i != arr[i] - 1){
                ls.add(arr[i]);
            }
        }

        return ls;
    }
}