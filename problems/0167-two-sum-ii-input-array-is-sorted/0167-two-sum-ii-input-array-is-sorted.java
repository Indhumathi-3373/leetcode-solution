class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        for(int right=numbers.length-1;right>=0;right--){
            int comp=numbers[right]+numbers[left];
            if(comp<target){
                left++;
                right++;
            }
            if(comp==target){
                return new int[]{left+1,right+1};
            }
        } return new int[]{};
    }
}