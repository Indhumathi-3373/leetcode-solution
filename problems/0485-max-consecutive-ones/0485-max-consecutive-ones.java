class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i:nums){
         if(i==0){
            count=0;
         }else{
            count++;
         }if(max<count){
            max=count;
         }
        
    }return max;
}}