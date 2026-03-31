class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {

        int i=0;
        int j=0;
        int n=word.length();
        int m=abbr.length();

        while(i<n && j<m){
            if(word.charAt(i)==abbr.charAt(j)){
                i++;
                j++;
            }else if(Character.isLetter(abbr.charAt(j))||abbr.charAt(j)=='0'){
                return false;

            }else{
                int len =0;
                while(j<m && !Character.isLetter(abbr.charAt(j))){
                    len = len*10 + (abbr.charAt(j) - '0');
                    j++;
                }
                i+=len;
            }
        }

return i==n && j==m;
        
    }
}