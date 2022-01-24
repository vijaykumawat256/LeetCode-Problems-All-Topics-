class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;

            for(int j=0;j<nums.length-1;j++){
                if(nums[j+1]!=nums[j]){
                    nums[count]=nums[j+1];
                    count++;
                  
                 
                }
                
               
            }
      
        return count;
    }
}