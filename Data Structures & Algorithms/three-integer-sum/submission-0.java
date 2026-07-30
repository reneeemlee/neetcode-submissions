class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // returned list
        List<List<Integer>> res = new ArrayList<>();

        // make list sorted
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // skips duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // j as left
            // k as right
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                // if curr sum num[j] + num[k] < target
                int pair = nums[left] + nums[right];
                int target = -nums[i];

                // if there is a match
                if (pair == target) {
                    res.add(new ArrayList<>(Arrays.asList(nums[left], nums[i], nums[right])));
                
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }

                else if (pair < target) {
                    // sum is too small, increment left
                    left++;
                } else {
                    // sum too larget, right smaller
                    right--;
                }
            }
        }

        return res;
    }
}
