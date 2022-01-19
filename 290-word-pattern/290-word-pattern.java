class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hp = new HashMap<>();
        String[] str = s.split(" ");
        
        HashSet<Character> set1  = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        
        
        if(pattern.length() != str.length) return false;
        
      
        
        for(int i=0; i<pattern.length(); i++) {
            
          
            
            
            set1.add(pattern.charAt(i));
            set2.add(str[i]);
            
            if(!hp.containsKey(pattern.charAt(i))) {
                hp.put(pattern.charAt(i), str[i]);
            } else {
                
                String curWord = hp.get(pattern.charAt(i));
                if(!curWord.equals(str[i])) return false;
            }
        }
        
        return set1.size()==set2.size() ? true : false;
    }
}