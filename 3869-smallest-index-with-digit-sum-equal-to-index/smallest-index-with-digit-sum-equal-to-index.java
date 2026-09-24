class Solution {
    public int smallestIndex(int[] nums) {

        int idx  = -1; 

        for(int i=0;i<nums.length;i++){
          // if(nums[i] == i) return i;

            int digit = nums[i];
            int sum =0;

            while(digit >0){
                int num = digit%10 ;
                sum +=num;
                digit /=10;

            }

            if(sum == i){
                idx = i;
                break;
            }
        }
        return idx;
        
    }
}