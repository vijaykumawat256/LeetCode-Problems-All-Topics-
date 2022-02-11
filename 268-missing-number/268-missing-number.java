class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int natural_sum= nums.length*(nums.length+1)/2;
        
        if(natural_sum-sum==0){
            return 0;
        }
        else return natural_sum-sum;
    }
}