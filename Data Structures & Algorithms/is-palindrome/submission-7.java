class Solution {
    public boolean isPalindrome(String s) {

        s=s.toLowerCase();
    
        s=s.replaceAll("[^a-z0-9]","");
        int n =s.length();

        for(int r=0;r<n/2;r++){
            if(s.charAt(r)!=s.charAt(n-1-r)){
                return false;
            }
        }
        return true;
    }
}
