class Solution {
    public String reverseOnlyLetters(String s) {
        int right=s.length()-1;
        int left=0;
        char chars[]=s.toCharArray();
       while(left<right){
            if(Character.isLetter(chars[left])){
                if(Character.isLetter(chars[right])){
                    char temp=chars[left];
                    chars[left]=chars[right];
                    chars[right]=temp;
                    right--;
                    left++;
                }else{
                    right--;
                }
            }else{
                left++;
            }
       }return new String(chars);
    }
}