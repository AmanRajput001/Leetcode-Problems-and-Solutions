class Solution {
    public boolean detectCapitalUse(String word) {
        char[] array = word.toCharArray();
        boolean flag = true;

        for (int i = 1; i < array.length; i++) {
            if (((int) (array[0]) > 64 && (int) (array[0]) < 91)
                    && ((int) (array[array.length - 1]) > 96 && (int) (array.length - 1) < 123)) {
                if ((((int) (array[i]) > 96 && (int) (array[i]) < 123) == false)) {
                    return false;
                }
            }
            else if (((int) (array[0]) > 96 && (int) (array[0]) < 123)
                    && ((int) (array[array.length - 1]) > 96 && (int) (array.length - 1) < 123)) {
                if ((((int) (array[i]) > 96 && (int) (array[i]) < 123) == false)) {               
                    return false;
                }
            }
            else if (((int) (array[0]) > 64 && (int) (array[0]) < 91)
                    && ((int) (array[array.length - 1]) > 64 && (int) (array.length - 1) < 91)) {
                if ((((int) (array[i]) > 64 && (int) (array[i]) < 91) == false)) {
                    return false;
                }
            }else{
                return false;
            }
        }

        return true;
    }
}