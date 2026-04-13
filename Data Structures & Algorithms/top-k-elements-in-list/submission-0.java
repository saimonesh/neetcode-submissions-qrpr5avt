class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        var x = new HashMap<Integer,Integer>();
        for(var num: nums){
            x.put(num,x.getOrDefault(num,0)+1);
        }
        return x.entrySet().stream().sorted((a,b)->
               b.getValue().compareTo(a.getValue()))
               .limit(k)
               .mapToInt(Map.Entry::getKey)
               .toArray();
    }
}
