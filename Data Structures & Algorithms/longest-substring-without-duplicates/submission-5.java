class Solution {
    // use a sliding window: shrinking window from left
    public int lengthOfLongestSubstring(String s) {
        // create a hashset of seen characters
        Set<Character> seen = new HashSet<>();
        // track left integer & longest integer
        int left = 0;
        int longest = 0;

        // going through every character
        for (int right = 0; right < s.length(); right++) {
            // while duplicate, shrink window from left
            while (seen.contains(s.charAt(right))) {
                seen.remove(s.charAt(left));
                left++;
            }

            // add characters to already seen (to track for duplicates)
            seen.add(s.charAt(right));

            // give the length of the longest substring
            longest = Math.max(right-left + 1, longest);
        }
        return longest;
    }
}
