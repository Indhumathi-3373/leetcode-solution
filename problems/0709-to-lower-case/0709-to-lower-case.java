class Solution {
    public String toLowerCase(String s) {
          
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                char c=(char)(ch+32);
               sb.append(c);
            }else{
                sb.append(ch);
            }
        }
        return String.valueOf(sb);
    }
}