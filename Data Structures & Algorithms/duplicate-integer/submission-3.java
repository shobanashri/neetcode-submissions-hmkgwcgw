class Solution {
    public boolean hasDuplicate(int[] nums) {

        int count = 0;
        boolean result = false;
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            
        }

        if(count!=0){
            result = true;
        }
        
       

        return result;

        
    }
}