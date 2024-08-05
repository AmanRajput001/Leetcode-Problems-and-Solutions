class Solution {
    public String kthDistinct(String[] arr, int k) {
        ArrayList<String> drr = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    if (arr[i].equals(arr[j])) {
                        flag = false;
                        break;
                    }
                } else {
                    continue;
                }
            }

            if (flag == true) {
                drr.add(arr[i]);
            }
        }

        if (k <= drr.size()) {
            return drr.get(k - 1);
        }

        return "";
    }
}