class Solution {
    public int numDecodings(String str) {
        int[] arr= new int[str.length()];
        
        arr[0]=1;
        if(str.charAt(0)=='0'){
            return 0;
        }
        for(int i=1;i<arr.length;i++){
            
            if(str.charAt(i-1)=='0' && str.charAt(i)=='0'){
                arr[i]=0;
            }
             else if(str.charAt(i-1)=='0' && str.charAt(i)!='0'){
                arr[i]=arr[i-1];
            }
             else if(str.charAt(i-1)!='0' && str.charAt(i)=='0'){
                if(str.charAt(i-1)=='1'|| str.charAt(i-1)=='2'){
                    arr[i]=(i>=2 ? arr[i-2] : 1);
                }
                 else{
                     arr[i]=0;
                 }
            }
            else{
                if(Integer.parseInt(str.substring(i-1,i+1))<=26){
                    arr[i]=arr[i-1]+(i>=2 ? arr[i-2] : 1);
                }
                else{
                    arr[i]=arr[i-1];
                }
                
            }
        }
    
        return arr[str.length()-1];
        
        
    }
}