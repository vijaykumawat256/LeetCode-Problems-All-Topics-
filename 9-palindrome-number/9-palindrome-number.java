class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int a=x;
      if(x<0){
          return false;
      }
        while(a!=0){
            rev=rev*10+a%10;
            a=a/10;
            
        }
        if(x==rev){
                return true;
            } 
       return false;
        
        
    }
}