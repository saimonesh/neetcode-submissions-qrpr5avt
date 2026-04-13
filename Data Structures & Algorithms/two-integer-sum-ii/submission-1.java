class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i=0;i<numbers.length;i++){
            int res = doBinarySearch(i+1,numbers.length-1,numbers,target-numbers[i]);
            if(res!=-1){
                return new int[]{i+1,res+1};
            }
        }
        return null;
    }

    public int doBinarySearch(int low,int high,int[] numbers,int target){
        if(high<low ){
            return -1;
        }
        int mid = (low + (high - low) / 2);
        if(numbers[mid]==target){
            return mid;
        }else
        {
            if(target>numbers[mid]){
                return doBinarySearch(mid+1,high,numbers,target);
            }else
            {
                return doBinarySearch(low,mid-1,numbers,target);
            }
        }

    }
}
