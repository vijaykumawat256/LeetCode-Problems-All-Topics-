class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length<3){
            return nums.length;
        }
        int count=2;

            for(int j=2;j<nums.length;j++){
                if(nums[j]!=nums[count-2]){
                    nums[count++]=nums[j];
                    
                                 
                }
               
            }
      
        return count;
        
    }
}