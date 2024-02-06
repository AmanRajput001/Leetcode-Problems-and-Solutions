class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length() < needle.length()){
            return -1;
        }
        
        char[] ch1 = haystack.toCharArray();
        char[] ch2 = needle.toCharArray();

        for (int i = 0, m = 0; i < ch1.length; i++) {
            for (int j = i; j < ch1.length && m < ch2.length; j++) {
                System.out.println(ch1[j] + " " + ch2[m]);
                if (ch1[j] == ch2[m]) {
                    m++;
                } else {
                    m = 0;
                    break;
                }

                if (m == ch2.length) {
                    return i;
                }
            }
        }

        return -1;
    }
}