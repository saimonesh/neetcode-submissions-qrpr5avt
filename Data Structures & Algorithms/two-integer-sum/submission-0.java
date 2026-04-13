class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> nn = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(nn.containsKey(target-num)){
                result = new int[]{nn.get(target-num),i};
                break;
            }
            nn.put(num,i);
        }
        return result;
    }
}
