class Solution {
    public int[][] merge(int[][] arr) {
        
        Pair[] pairs=new Pair[arr.length];
        
        for(int i=0;i<pairs.length;i++){
            pairs[i]=new Pair(arr[i][0],arr[i][1]);
        }
        
        Arrays.sort(pairs);
        
        Stack<Pair> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(i==0){
                st.push(pairs[i]);
                
            }
            else{
                Pair top=st.peek();
                
                if(pairs[i].st>top.et){
                    st.push(pairs[i]);
                }
                else{
                    top.et=Math.max(top.et,pairs[i].et);
                }
            }
        }
        int ret[][] = new int[st.size()][2];
        int s = st.size();
        for(int i = s - 1; i >=0 ; i--){
            
            Pair rem = st.pop();
                
            ret[i][0] = rem.st;
            ret[i][1] = rem.et;
        }
        
        return ret;
        
        
    }
    
    public static class Pair implements Comparable<Pair>{
        int st;
        int et;
        
        Pair(int st,int et){
            this.st=st;
            this.et=et;
        }
        
        public int compareTo(Pair other){
            if(this.st!=other.st){
                return this.st-other.st;
            }
            else{
                return this.et-other.et;
            }
        }
    }
}
    
