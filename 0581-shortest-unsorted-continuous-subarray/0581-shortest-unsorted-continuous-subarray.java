class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[] = nums.clone();
        Arrays.sort(arr);
        int end=0, start =arr.length-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=nums[i]){
                start = Math.min(start, i);
                end = Math.max(end, i);   
            }
        }
        int res = end-start>0? end-start+1: 0;
        return res;
    }
}