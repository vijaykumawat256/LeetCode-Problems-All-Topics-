class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if((arr[mid]-mid-1)<k){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        // Left suggests that the missing number has to be in the range of arr[left - 1] to arr[left]
        // Left means that there are #left non-missing numbers ahead of the missing number 
        // k means that there are k - 1 missing numbers ahead of the missing number
        // So to get the missing number, we do left + k - 1 + 1 = left + k
        return left + k;
    }
}