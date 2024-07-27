class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        char[] array = word.toCharArray();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            if (set.contains(array[i])) {
                continue;
            }else{
            set.add(array[i]);
            if (Character.isLowerCase(array[i])) {
                char temp = Character.toUpperCase(array[i]);
                if (word.indexOf(temp) != -1) {
                    count += 1;
                }
            } else if (Character.isUpperCase(array[i])) {
                char temp = Character.toLowerCase(array[i]);
                if (word.indexOf(temp) != -1) {
                    count += 1;
                }
            }}

        }

        return count/2;
    }
}