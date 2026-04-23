class Solution {
    public int strStr(String haystack, String needle) {
        int chunk=needle.length();
        for(int i=0;i<=haystack.length()-chunk;i++){

            String part=haystack.substring(i,i+chunk);
            if(part.contains(needle)){
                return i;
            }
        }

    return -1;
    }
}