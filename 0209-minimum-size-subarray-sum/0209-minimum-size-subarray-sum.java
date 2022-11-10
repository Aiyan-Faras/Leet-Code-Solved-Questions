class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start= 0,end= 0, minLength = Integer.MAX_VALUE;
        int runningSum=0;
        for(end =0; end<nums.length; end++){
            runningSum += nums[end];
            while(runningSum>=target){
                minLength = Math.min(minLength, end-start+1);
                runningSum -= nums[start];
                start++;
            }
        }
        minLength = minLength!=Integer.MAX_VALUE?minLength:0;
        return minLength;
    }
}