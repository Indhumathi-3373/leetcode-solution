class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        int last=-1;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(target==nums[middle]){
                last=middle;
                low=middle+1;
            }else if(target>nums[middle]){
                low=middle+1;
            }else{
                high=middle-1;
            }
        }

       
  return new int[]{first, last};
    }
    
}