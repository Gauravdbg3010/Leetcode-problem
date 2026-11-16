class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        long sum  =0;
        int left =0;
        int count =0;

        for(int right  =0;right<nums.length;right++){
            sum +=nums[right];

            if(right -left+1 >k){
                sum -=nums[left];
                left++;
            }

            if(right-left+1 ==k){
                long average = sum/k;
               if(average>=threshold )count++;
            }
        }

        return count;
        
    }
}