class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {

        int n = nums.length;

        int result [] = new int[n-k+1];

        int freq [] = new int[51];

        for(int i=0;i<k;i++){

            if(nums[i]<0) freq[-nums[i]]++;
        }

        for(int i =0;i<=n-k;i++){
            int count =0;
            result[i] =0;
         for(int  j=50; j>=1 ;j--){
            count +=freq[j];
            if(count >=x){
                result[i] = -j;

                break;

            }
        }

         if(i<n-k){
            int left = nums[i];
            int right = nums[i+k];

            if(left <0) freq[-left]--;
            if(right <0) freq[-right]++;

         }
        }

        return result;

        
    }
}