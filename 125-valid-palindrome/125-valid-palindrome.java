class Solution {
    public boolean isPalindrome(String s) {
     s=s.replaceAll("[^a-zA-Z0-9]+", "");
      s=s.toLowerCase();
        System.out.println(s);
   String str1=" ";
        String str2=" ";
        
    for(int i=-1+s.length()/2;i>=0;i--){
        str1=str1+s.charAt(i);
    }
    if(s.length()%2==0){
        for(int i=s.length()/2;i<s.length();i++){
        str2=str2+s.charAt(i);
    }
      
    }
        else{
             for(int i=1+s.length()/2;i<s.length();i++){
        str2=str2+s.charAt(i);
        }
          
            
    }
      return str1.equals(str2) ? true : false;
        
    }
}