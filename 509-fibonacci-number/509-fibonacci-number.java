class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        if(n==0||n==1){
            return n;
        }
        int num1=fib(n-1);
        int num2=fib(n-2);
        int num=num1+num2;
        
        return num;
        
    }
}