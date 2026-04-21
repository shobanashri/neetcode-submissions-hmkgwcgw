class Solution {
    public int scoreOfString(String s) {

        int n = 0;


        for(int i=0;i<s.length()-1;i++){
            char c1 = s.charAt(i);
            char c2 = s.charAt(i+1);
            n+=Math.abs(c2-c1);
        }

        return n;
        
    }
}