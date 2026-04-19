class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int localSum =0;
        for(int i=0;i<nums.length;i++){
            if(localSum < 0){
                localSum = 0;
            }
            localSum+=nums[i];
            max = Math.max(localSum,max); 
        }
        return max;
    }
}
