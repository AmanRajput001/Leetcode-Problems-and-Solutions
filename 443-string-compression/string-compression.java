class Solution {
    public int compress(char[] chars) {
        int index = 0;
        int i = 0;
        int n = chars.length;

        while (i < n) {
            char curr_char = chars[i];
            int count = 0;

            while (i < n && curr_char == chars[i]) { 
                i++;
                count++;
            }
            if (count > 1) {
                chars[index++] = curr_char;
                String ch = Integer.toString(count);
                int k = 0;

                while (k < ch.length()) {
                    chars[index++] = ch.charAt(k++);
                }
            }else{
                chars[index++] = curr_char;
            }
        }

        return index;
    }
}