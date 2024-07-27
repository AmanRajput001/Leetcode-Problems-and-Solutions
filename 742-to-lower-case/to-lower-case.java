class Solution {
    public String toLowerCase(String s) {
        char temp[] = new char[s.length()];
        char chArray[] = s.toCharArray();

        for (char i = 0; i < s.length(); i++) {
            if ((int) chArray[i] > 64 && (int) chArray[i] < 91) {
                int ch = (int) chArray[i] + 32;
                temp[i] = (char) (ch);
            } else {
                temp[i] = chArray[i];
            }
        }

        return new String(temp);
    }
}