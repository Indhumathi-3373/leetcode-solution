class Solution {

    public int sumOfUnique(int[] nums) {

        HashSet<Integer> unique = new HashSet<>();
        HashSet<Integer> duplicate = new HashSet<>();
        int sum = 0;
        for(int num : nums){
            if(duplicate.contains(num)){
                continue;
            }
            if(unique.contains(num)){
                unique.remove(num);
                duplicate.add(num);
            }
            else{
                unique.add(num);
            }
        }
        for(int num : unique){
            sum += num;
        }
        return sum;
    }
}