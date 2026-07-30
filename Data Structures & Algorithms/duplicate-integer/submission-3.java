class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int curr : nums) {
            if (set.contains(curr)) {
                return true;
            }
        
            set.add(curr);
        }

        return false;
    }
}