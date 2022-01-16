class Solution {
    int sum=0;
    public int titleToNumber(String columnTitle) {
        int j=0;
       for(int i=columnTitle.length()-1;i>=0;i--){
         
           int num=(int) columnTitle.charAt(i);
           sum=sum+(num-64)*(int)(Math.pow(26,j));
           j++;
           
       }
        return sum;
    }
    
    
}