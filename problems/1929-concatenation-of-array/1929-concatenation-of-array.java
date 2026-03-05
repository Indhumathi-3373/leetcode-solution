class Solution {
    public int[] getConcatenation(int[] nums) {
        int k[]=new int[nums.length*2];
       for(int i=0;i<nums.length;i++){
        k[i]=nums[i];
        k[i+nums.length]=nums[i];
       }return k;
    }
}