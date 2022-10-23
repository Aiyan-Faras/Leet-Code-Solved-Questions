class Solution {
    public int[] findErrorNums(int[] nums) {
        int index=0;
        while(index<nums.length){
            int correct = nums[index]-1;
            if(nums[index]!=nums[correct]){
                int temp = nums[index];
                nums[index] = nums[correct];
                nums[correct] = temp;
            }else{
                index++;
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i]!= i+1){
                return new int []{nums[i],i+1};
            }
        }
        
        return new int []{-1,-1};
    }
}