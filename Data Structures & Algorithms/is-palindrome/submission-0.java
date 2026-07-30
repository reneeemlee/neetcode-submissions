class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String result = sb.toString();
        result = result.toLowerCase();

        int index = 0;
        for (int i = 0; i < (result.length()/2); i++) {
            if (!(result.charAt(index) == (result.charAt(result.length() - 1 - i)))) {
                return false;
            }

            index++;
        }

        return true;
    }
}
