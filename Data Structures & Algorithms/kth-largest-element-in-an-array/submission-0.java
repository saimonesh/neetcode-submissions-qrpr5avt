class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> x = new PriorityQueue<>(Comparator.reverseOrder());
        for(int num:nums)x.offer(num);
        int res=0;
        while(k>0){
            res = x.poll();
            k--;
        }
        return res;
    }
}
