class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
        if(needle.length()>haystack.length()|| needle==null || haystack==null){
            return -1;
        }
        
        int  need=needle.length();
        
        for(int i=0;i<haystack.length()-need+1;i++){
             if(haystack.charAt(i)==needle.charAt(0)){
                 if(haystack.substring(i,need+i).equals(needle)){
                     return i;
                 }
             }
                
            
        }
   
        return -1;
        
    }
}