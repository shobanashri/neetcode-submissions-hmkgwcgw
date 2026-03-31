class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        for(char st:s.toCharArray()){
            if(Character.isLetterOrDigit(st)){
                str.append(Character.toLowerCase(st));
            }
        }

        return str.toString().equals(str.reverse().toString());


    }
}
