class Solution {
    public boolean validMountainArray(int[] arr) {
      
        int i=0;
        if(arr.length<3){
            return false;
        }
       while(i<arr.length&& i+1<arr.length && arr[i]<arr[i+1] && arr[arr.length-1]<arr[arr.length-2]){
  
           i++;
       }
         while(i<arr.length && i+1<arr.length && arr[i]>arr[i+1]&& arr[0]<arr[1]){
         
             i++;
       }
        
        
        if(i==arr.length-1){
            return true;
        }
        
        else
            return false;
        
        
    }
}