class Solution {
    public int removeElement(int[] num, int val) {
        if(num.length==0) return 0;
        
        int j=0;
        for(int i=0;i<num.length;i++){
            if(num[i]!=val){
                  num[j]=num[i];   j++;        
            }
        }return j;
    }
}