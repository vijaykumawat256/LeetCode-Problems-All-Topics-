class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] nums=new int[m+n];
        int ind=0;
        for(int i = 0; i <m;i++){
            if(nums1[i]!=0){
                nums1[i]=nums1[i];
            } 
            
        }
         for(int i = 0; i <n;i++){
            if(nums2[i]!=0){
                nums1[m]=nums2[i];
                m=m+1;
            } 
            
        }
         Arrays.sort(nums1);
        
        
    }
}