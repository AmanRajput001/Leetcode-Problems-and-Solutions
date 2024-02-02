class Solution {
    public int reverse(double x) {
        double rev = 0;
        boolean neg = false;

        if(x < 0){
            x *= -1;
            neg = true;
        }

        if(x > Integer.MAX_VALUE){
            return 0;
        } 

        int num = (int) x;

        while(num != 0){
            if((rev * 10 + 1) > (Integer.MAX_VALUE)){
                return 0;
            }
        
            rev = rev * 10 + (num % 10);
            num /= 10;
        }

        if(neg == true){
            rev *= -1;
        }

        return (int) rev;
    }
}