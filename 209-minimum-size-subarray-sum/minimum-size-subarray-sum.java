class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minisize =Integer.MAX_VALUE;
        int sum =0;
        int left =0;

        for(int right =0;right<nums.length;right++){
            sum +=nums[right];

           while(sum >=target){
                minisize = Math.min(minisize,right-left+1);

                sum -=nums[left];
                left++;
            }

        }

        return minisize == Integer.MAX_VALUE?0:minisize;
        
    }
}