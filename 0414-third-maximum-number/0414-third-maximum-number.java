class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            set.add(nums[i]);
        }
        
        PriorityQueue<Integer> que = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int item: set){
            que.add(item);
        }
        
        if(que.size()<3){
            return que.poll();
        }else{
            que.poll();
            que.poll();
            return que.poll();
        }
    }
}