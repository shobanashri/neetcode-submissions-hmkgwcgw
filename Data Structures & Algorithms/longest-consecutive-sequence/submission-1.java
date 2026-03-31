class Solution {
    public int longestConsecutive(int[] nums) {

        int count = 0;
        Set<Integer> set = new TreeSet<>();
        for (int n : nums) {
           set.add(n);
        }
        
        for(int num:nums){
            int streak=0, curr=num;

            while(set.contains(curr)){
                streak++;
                curr++;
            }

            count = Math.max(count,streak);
        }


        

        return count;
        
    }
}
