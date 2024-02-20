class Solution {
    public String triangleType(int[] ar) {

        int a = Math.abs(ar[0] + ar[1]);
        int b = Math.abs(ar[1] + ar[2]);
        int c = Math.abs(ar[2] + ar[0]);

        if (a == b && b == c && c == a) {
            return "equilateral";
        } else if ((ar[0] == ar[1] && (ar[1] != ar[2]) && (a > ar[2])) ||
                (ar[1] == ar[2] && (ar[1] != ar[0]) && (b > ar[0])) ||
                ((ar[2] != ar[1]) && ar[2] == ar[0]) && (c > ar[1])) {
            return "isosceles";
        } else if ((a > ar[2] && b > ar[0] && c > ar[1])) {
            return "scalene";
        }
        return "none";
    }
}