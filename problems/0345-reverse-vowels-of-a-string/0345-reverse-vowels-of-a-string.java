class Solution {
    public String reverseVowels(String s) {
        char[] str = s.toCharArray();
        int left = 0;

        for (int right = str.length - 1; right > left; right--) {

            if (str[left] == 'a' || str[left] == 'e' || str[left] == 'i' ||
                str[left] == 'o' || str[left] == 'u' || str[left] == 'A' ||
                str[left] == 'E' || str[left] == 'I' || str[left] == 'O' ||
                str[left] == 'U') {

                if (str[right] == 'a' || str[right] == 'e' || str[right] == 'i' ||
                    str[right] == 'o' || str[right] == 'u' || str[right] == 'A' ||
                    str[right] == 'E' || str[right] == 'I' || str[right] == 'O' ||
                    str[right] == 'U') {

                    char temp = str[left];
                    str[left] = str[right];
                    str[right] = temp;

                    left++;  
                }

            } else {
                left++;
                right++;  
            }
        }

        return new String(str);
    }
}