class Solution {
    public int search(int[] nums, int target) {
        return BS(0,nums.length-1,nums,target);
    }
    public int BS(int s,int e,int[] nums,int target){
        while(s<=e){
           int mid = s + ((e-s)/2);
            if(nums[mid]>target) {
                e = mid-1;
            }else if (nums[mid]<target){
                s = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
