class Solution {
    public int[] twoSum(int[] nums, int target) {
        // get first num then second
        // if first + second == target, return indices

        int indexOne = 0;
        int indexTwo = 1;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
