class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>list=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i:nums){
         list.add(i);
        }
        for(int i=min;i<=max;i++){
            if(!list.contains(i)){
                li.add(i);
            }
        }return li;

    }
}