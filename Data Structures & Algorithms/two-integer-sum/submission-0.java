class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int b = target - nums[i];
            if(map.containsKey(b)){
                int idx = map.get(b);
                return new int[]{idx,i};
            }map.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}
