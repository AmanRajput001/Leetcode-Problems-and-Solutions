class Solution {
    public boolean divisorGame(int n) {
        boolean alice = false, bob = true;


        for( int i = n - 1; i != 0; i--){

            if(bob == false){
                alice = false;
                bob = true;
            }else{
                alice = true;
                bob = false;
            }
            n = n - 1;
        }

        return alice;
    }
}