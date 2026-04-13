class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> result = new HashMap<>();
        for(String s:strs){
            var x = calculateIntMat(s.toCharArray());
            result.computeIfAbsent(x,(k)->new ArrayList());
            result.get(x).add(s);
        }
        return result.values().stream().collect(Collectors.toList());
    }
    String calculateIntMat(char[] arr)
    {
        int[] res = new int[26];
        for(char c:arr) res[c-'a']++;
        return Arrays.toString(res);
    }
}
