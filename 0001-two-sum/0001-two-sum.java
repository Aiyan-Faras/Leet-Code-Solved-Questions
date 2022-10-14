class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i <nums.length; i++){
            if(map.containsKey(target - nums[i])){
                result[1] = i;
                result[0] = map.get(target-nums[i]);
            }
            map.put(nums[i],i);//[2,7,11,15](2,0)(7,1)(11,2)(15,3)if target =18
        }
        return result;
    }
}