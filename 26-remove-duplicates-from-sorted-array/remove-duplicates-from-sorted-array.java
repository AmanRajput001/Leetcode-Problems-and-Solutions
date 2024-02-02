class Solution {
public int removeDuplicates(int[] arr) {
        int k = 0;
        for(int i = 0, n = (arr.length - 1); i < n && i < arr.length && n >= 0;){
            if (arr[i] == arr[n]) {
                k = n;
                break;
            } else {
                boolean flag = false;
                if (i + 1 != arr.length && arr[i] == arr[i + 1]) {                    
                    flag = true;
                    for (int start = i; start < arr.length - 1; start++) {
                        arr[start] = arr[start + 1];
                    }
                    k++;
                    n -= 1;
                }
                if (n - 1 != -1 && arr[n - 1] == arr[n]) {
                    flag = true;
                    for (int end = n; end < arr.length - 1; end++) {
                        arr[end] = arr[end + 1];
                    }
                    n--;  
                    k++;
                }
                if (flag == false) {
                    i += 1;
                }
            }
        }
        return arr.length - k;
    }
}