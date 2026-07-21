class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double res=Double.NEGATIVE_INFINITY;
        for(int i=0;i<=nums.length-k;i++){
          int sum=0;
          for(int j=i;j<k+i;j++){
            sum+=nums[j];
          }
          res=Math.max(res,(double)sum / k);
        }return res;
    }
}