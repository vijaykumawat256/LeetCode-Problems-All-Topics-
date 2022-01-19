
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hp = new HashMap<>();
        
        Set<Character> set1  = new HashSet<>();
        Set<Character> set2 = new HashSet<>();  
        
        if(s.length() != t.length()){
           return false; 
        }  
        
        for(int i=0; i<s.length(); i++) {
          
            set1.add(s.charAt(i));
            set2.add(t.charAt(i));
            
            if(!hp.containsKey(s.charAt(i))) {
                hp.put(s.charAt(i), t.charAt(i));
            } 
            
            else {
                
               char ch = hp.get(s.charAt(i));
                if(ch!=(t.charAt(i))) return false;
            }
        } 
        
        return set1.size()==set2.size() ? true : false;
    }
}