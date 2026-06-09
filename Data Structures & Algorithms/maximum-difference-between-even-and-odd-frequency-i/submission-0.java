class Solution {
    public int maxDifference(String s) {

        int[] count = new int[26];

        for(char ch: s.toCharArray()){
            count[ch - 'a']++;
        }

        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for(int c :count){
            if(c==0) continue;

            if(c%2==1){
                maxOdd = Math.max(maxOdd,c);
            }else{
                minEven = Math.min(minEven,c);
            }
            
        }

        return maxOdd-minEven;
        


        
    }
}