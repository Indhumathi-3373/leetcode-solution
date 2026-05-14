import java.util.HashSet;

class Solution {
  public int missingNumber(int[] nums){
    HashSet<Integer> set=new HashSet<>();
    for(int k:nums){
        set.add(k);
    }
     int res=0;
     int j=0;
     for(int i=0;i<nums.length+1;i++){
         if(!set.contains(j)) return j;
         j++;
     }
     return res;
    }
}