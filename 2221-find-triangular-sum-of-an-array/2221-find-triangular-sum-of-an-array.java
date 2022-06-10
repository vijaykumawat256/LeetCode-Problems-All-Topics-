class Solution {
static int[][] dp;
int mod(int x){
x = x%10;
if(x<0){
x += 10;
}
return x;
}
public int triangularSum(int[] nums) {
if(dp==null){
dp = new int[1000][1002];
dp[0][0] = 1;
for(int i=1;i<1000;i++){
for(int j=0;j<=i;j++){
int left = dp[i-1][j];
int right = (j==0)?0:dp[i-1][j-1];
dp[i][j] = mod(left+right);
//System.out.print(dp[i][j]+" ");
}
//System.out.println(" ");
}
}
int res = 0;
int n = nums.length;
for(int i=0;i<n;i++){
res += (dp[n-1][i]*nums[i]);
res = mod(res);
//System.out.print(dp[n-1][i]+" ");
}
return res;
}
}