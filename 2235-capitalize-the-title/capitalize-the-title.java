class Solution {
    public String capitalizeTitle(String title) {
        String[] array= title.split(" ");

        for(int i = 0; i < array.length; i++){
            if(array[i].length() <= 2){
                array[i] = array[i].toLowerCase();
            }else{
                array[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1).toLowerCase();
            }
        }

        return String.join(" ", array);
    }
}