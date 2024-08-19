class Solution {
    public int minSteps(int n) {
        if(n > 1){
            int num = n;
            int i = 2;
            int count = 0;
            while(num != 1 && num >= i){     
                while(num % i == 0){       
                    count += i;
                    num /= i;
                }
                i++;
            }
            return count;
        }
        return 0;
    }
}