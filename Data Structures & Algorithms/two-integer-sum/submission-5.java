class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>m=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int component=target-nums[i];
            if(m.containsKey(component)){
                return new int[]{m.get(component),i};
            }
            m.put(nums[i],i);

        }
        return new int[]{};
    }
}
