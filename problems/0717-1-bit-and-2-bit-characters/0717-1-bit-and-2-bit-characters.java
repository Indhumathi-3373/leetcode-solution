class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i=0;
        int bit=bits.length-1;
        while(i<bit){
            if(bits[i]==0){
                i++;
            }else{
                i=i+2;
            }
        }return i==bit;
    }
}