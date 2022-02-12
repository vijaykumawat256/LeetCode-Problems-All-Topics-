class Solution {
    public int maxArea(int[] height) {
        int maxm=0;
        int start=0;
        
        int end=height.length-1;
        
        while(start<=end){
            int top=Math.min(height[start],height[end]);
            int area= top*(end-start);
            maxm=Math.max(maxm,area);
            
            if(height[start]>=height[end]){
                end--;
            }
            else
                start++;
            
        }
        return maxm;
        
    }
}