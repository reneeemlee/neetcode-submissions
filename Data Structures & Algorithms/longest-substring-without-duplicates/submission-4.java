class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int left = 0;
        int longest = 0;

        for (int right = 0; right < s.length(); right++) {
            char curr = s.charAt(right);

            // while duplicate, shrink window from left
            while (seen.contains(curr)) {
                seen.remove(s.charAt(left));
                left++;
            }

            seen.add(curr);

            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}
