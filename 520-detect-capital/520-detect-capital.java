class Solution {
    public boolean detectCapitalUse(String word) {
    int count1=0;
    int count2=0;
        int count3=0;
        
        
     if(word.charAt(0)>64 && word.charAt(0)<91){   
    for(int i=1;i<word.length();i++){
        if(word.charAt(i)>64 && word.charAt(i)<91){
           count1=count1+1; 
        }
        else if(word.charAt(i)>96 && word.charAt(i)<123){
            count2=count2+1;
        }
       
        
        }
       
    }
    else
    {
        for(int i=0;i<word.length();i++){
        if(word.charAt(i)>96 && word.charAt(i)<123){
           count3=count3+1; 
        }
        }
    }
        
        if(count2 ==word.length()-1 ||count1==word.length()-1||count3==word.length()){
            return true;
        }
        else{
            return false;
        }
    }
}