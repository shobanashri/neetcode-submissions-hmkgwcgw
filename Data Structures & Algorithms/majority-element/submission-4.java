class Solution {
    public int majorityElement(int[] nums) {

        int count=0;
        int res=0;
        for(int num:nums){
            for(int i:nums){
                if(num==i){
                    count++;
                }
            }

            if(count>nums.length/2){
                return num;
            }
        }
        return -1;



        
    }
}