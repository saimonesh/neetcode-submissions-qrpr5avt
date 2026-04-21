class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> x = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n:stones) x.offer(n);
        while(x.size()>1){
            int num1 = x.poll();
            int num2 = x.poll();
            x.offer(num1-num2);
        }
        return x.poll();
    }
}
