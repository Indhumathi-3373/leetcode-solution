class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.toLowerCase().split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            if (words[i].length() <= 2) {
                result.append(words[i]);
            } else {
                result.append(Character.toUpperCase(words[i].charAt(0)));
                result.append(words[i].substring(1));
            }

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}