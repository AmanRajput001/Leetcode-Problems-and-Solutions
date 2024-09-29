class Solution {
    public boolean rotateString(String s, String goal) {
        Queue<Character> q1 = new LinkedList<>();

        for(char c : s.toCharArray()){
            q1.add(c);
        }

        Queue<Character> q2 = new LinkedList<>();

        for(char c : goal.toCharArray()){
            q2.add(c);
        }

        int k = goal.length();

        while(k != 0){
            System.out.println(k + " " + q2);
            if(q1.equals(q2)){
                return true;
            }

            char c = q2.poll();
            q2.add(c);
            k--;
        }

        return false;
    }
}