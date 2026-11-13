class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
       long prefix[] = new long [n];
       prefix[0] = nums[0];
       for(int  i=1;i<n ;i++){
        prefix[i] = prefix[i-1]+nums[i];
       }

       long total = prefix[n-1];
       int numsplit =0;

       for(int i=0;i<n-1;i++){
        if(prefix[i]>=total-prefix[i]) numsplit++;
       }

       return numsplit;
    }
}