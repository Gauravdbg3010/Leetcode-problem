class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left =0;
        int right = tokens.length-1;
        int score =0;
        int maxs =0;

        while(left<=right){
            if(power >=tokens[left]){
                power -= tokens[left];
                score +=1;
                left ++;
                 maxs = Math.max(maxs,score);
            }else if(score >0){
                power += tokens[right];
                score -=1;
                right--;
            }else{
                break;
            }
        }
        return maxs;
    }
}