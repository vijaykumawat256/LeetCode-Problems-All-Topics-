class Solution {
    public char findTheDifference(String s, String t) {
        
        int[] arr=new int[26];
        
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        
        for(int j=0;j<t.length();j++){
            if(arr[t.charAt(j)-'a']>0){
                arr[t.charAt(j)-'a']--;
            }
            else{
                return t.charAt(j);
            }
        }
        return 'a';
        
    }
}