class Solution {
    public boolean isValid(String s) {

        Stack<Character> st=new Stack<>();
        
        for(int i=0; i<s.length(); i++){

            if(s.charAt(i)==')'){
                if(st.isEmpty()) return false;
                
                if(st.peek()=='(')
                    st.pop();
                else return false;
            }
             else if(s.charAt(i)==']'){
                 if(st.isEmpty()) return false;
                
                 if(st.peek()=='[')
                    st.pop();
                 else return false;
            }
             else if(s.charAt(i)=='}'){
                 if(st.isEmpty()) return false;
                
                 if(st.peek()=='{')
                    st.pop();
                 else return false;
            }
            else{
               st.push(s.charAt(i)); 
            }

    } 
        
        return (st.isEmpty()) ?  true :  false;
        
    }
}