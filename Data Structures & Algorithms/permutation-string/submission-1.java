class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())return false;
        int[] freq1 = new int[26];
        int[] freq2= new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        int i=0,j=s1.length();
        while(j<s2.length()){   
            if(Arrays.toString(freq1).equals(Arrays.toString(freq2))){
                return true;
            }else{
                freq2[s2.charAt(i)-'a']--;
                freq2[s2.charAt(j)-'a']++;
                j++;
                i++;
            }
        }

        return Arrays.toString(freq1).equals(Arrays.toString(freq2));
    }
}
