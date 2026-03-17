class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            int reminder=columnNumber%26;
            char ch=(char)('A'+reminder);
            res.append(ch);
            columnNumber/=26;
        }
        return res.reverse().toString();
    }
}