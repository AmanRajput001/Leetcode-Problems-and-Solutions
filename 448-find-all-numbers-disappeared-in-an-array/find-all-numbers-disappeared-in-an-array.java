// Google Question

class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        // cylic sort
        for(int i = 0; i < arr.length;){
            int correct_index = arr[i] - 1;

            if(arr[correct_index] == arr[i]){
                i++;
            }else{
                int temp = arr[correct_index];
                arr[correct_index] = arr[i];
                arr[i] = temp;
            }
        }

        List<Integer> ls = new ArrayList<>();

        // check missing values and add in list
        for(int i = 0; i < arr.length;){
            if(i == arr[i] - 1){
                i++;
            }else{
               ls.add(i+1); 
               i++;
            }
        }
        
        //System.out.println(Arrays.toString(arr));

        if(!(ls.contains(arr.length)) && (arr[arr.length - 1] != arr.length)){
            ls.add(arr.length);
            
        }

        return ls;
    }
}