class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (m.containsKey(diff)) {
                res[1]=i+1;
                res[0]=m.get(diff);
                return res;
            }
            m.put(nums[i],i+1);
            
            
        }
        
        return res;
    }
}
 