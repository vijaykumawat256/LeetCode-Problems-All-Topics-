class Solution {
    int sum=0;
    public int titleToNumber(String columnTitle) {
        int len=columnTitle.length();
        int j=0;
       for(int i=len-1;i>=0;i--){
           char var=columnTitle.charAt(i);
           int num=(int) var;
           sum=sum+(num-64)*(int)(Math.pow(26,j));
           j++;
           
       }
        return sum;
    }
    
    
}