class Solution {
    public int alternateDigitSum(int n) {
        int length=0;
        int res=0;
        int org=n;
        while(n>0){
            length++;
             n=n/10;
        }
        int num[]=new int[length];
        for(int i=length-1;i>=0;i--){
            num[i]=org%10;
            org/=10;
        }
        for(int j=0;j<length;j++){
            if(j%2==0){
                 res+=num[j];
            }else{
                res-=num[j];
            }
        }return res;
    }
}