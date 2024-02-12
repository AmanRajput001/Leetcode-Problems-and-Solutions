class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        } else {
            char[] sch = s.toCharArray();
            char[] tch = t.toCharArray();

            for (int i = 0; i < sch.length; i++) {
                for (int j = 0; j < sch.length; j++) {
                    if (sch[j] == sch[i] && i != j) {
                        if (tch[j] != tch[i]) {
                            return false;
                        }
                    }
                    if (tch[j] == tch[i] && i != j) {
                        if (sch[j] != sch[i]) {
                            return false;
                        }
                    }
                }
            }

        }

        return true;
    }
}