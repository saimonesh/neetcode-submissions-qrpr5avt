class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        for(char c:tasks) freq[c-'A']++;
        int maxF = Arrays.stream(freq).max().getAsInt();
        long maxFCount =Arrays.stream(freq).filter(l->l==maxF).count();
        int time = (maxF-1)*(n+1)+(int)maxFCount;
        return Math.max(tasks.length,time);


    }
}
