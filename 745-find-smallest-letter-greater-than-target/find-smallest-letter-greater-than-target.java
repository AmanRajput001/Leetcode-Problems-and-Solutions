class Solution {
    public char nextGreatestLetter(char[] ch, char target) {
        int start = 0;
        int end = ch.length - 1;

        while (start <= end) {
            int mid = (start + (end - start) / 2);

            if (target >= ch[mid]) {
                start = mid + 1;
            } else if (target < ch[mid]) {
                end = mid - 1;
            }

        }
        return ch[start % ch.length];
    }
}