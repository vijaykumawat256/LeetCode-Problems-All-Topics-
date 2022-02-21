class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int[] arr=new int[nums.length];
       Map<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            map.put(nums[i],1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if( entry.getValue()>nums.length/2){
                count=entry.getKey();
            }
        }
      
        System.out.println(map.get(2));
        
        return count;
        
    }
}