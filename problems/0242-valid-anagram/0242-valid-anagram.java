class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            char c=t.charAt(i);
            freq[ch-'a']++;
            freq[c-'a']--;
        }
        for(int j:freq){
            if(j!=0) return false;
        }return true;
       
    }
}