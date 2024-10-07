class Solution {
    public boolean isAnagram(String s, String t) {
        char ch1[] = s.toCharArray();
        char ch2[]= t.toCharArray();

        Arrays.sort(ch2);
        Arrays.sort(ch1);

        String str1 = new String(ch1);
        String str2 = new String(ch2);

        if(str1.equals(str2))
            return true;
        else
            return false;
    }
}