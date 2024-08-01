class Solution {
    public int countSeniors(String[] details) {
        int count = 0;

        for(String d : details){
            String s = d.substring(11, 13);
            if(Integer.valueOf(s) > 60){
                count++;
            }
        }
        return count;
    }
}