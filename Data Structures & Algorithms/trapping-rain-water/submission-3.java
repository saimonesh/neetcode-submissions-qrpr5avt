class Solution {
    public int trap(int[] height) {
        int left =0,right =height.length-1;
        int lmax = height[0];
        int rmax = height[right];
        int result =0;
        while(left<right){
            if(lmax<rmax){
              left++;
              lmax = Math.max(lmax,height[left]);
              result+= lmax-height[left];
            }else
            {
                right--;
              rmax = Math.max(rmax,height[right]);
              result+= rmax-height[right];
              
            }
        }
        return result;
    }
}
