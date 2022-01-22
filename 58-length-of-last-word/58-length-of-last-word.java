class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr= s.split(" ",s.length());
        System.out.println(Arrays.toString(arr));  
        
       int count=0;
      
           for(int i=arr.length-1;i>=0;i--){
               String last=arr[i];
               if(last.length()>0){
                 
                count=last.length();
                   
                   return count;
                
               }
           } 
        
   
       
        return count;
    }
}