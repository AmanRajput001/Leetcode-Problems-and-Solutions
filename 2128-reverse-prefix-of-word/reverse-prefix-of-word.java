class Solution {
    public String reversePrefix(String word, char ch) {
        char []array = word.toCharArray();
        String temp = "";
        boolean flag = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == ch){
                for(int  j = i; j >= 0; j--){
                    temp += array[j];
                }
                for(int j = i+1; j < array.length; j++){
                    temp += array[j];
                }
                
                flag = true;
                break;
            }
        }

        if (flag == false){
            temp = word;
        }

        return temp;
    }
}