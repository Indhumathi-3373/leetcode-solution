class Solution {
    public static String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=0;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }return prefix;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] arr=new String[3];
        for(int i=0;i<3;i++){
            arr[i]=s.nextLine();
        }
        System.out.println(longestCommonPrefix(arr));
    }
}