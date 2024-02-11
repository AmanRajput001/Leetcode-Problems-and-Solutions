class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        char []str = s.toCharArray();

        for(int i=0, j= str.length-1;i <= j; i++, j--){
            if(str[i] == str[j]){
                //
            }else{
                return false;
            }
        }
        return true;
    }
}