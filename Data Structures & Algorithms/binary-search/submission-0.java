class Solution {
    public int search(int[] nums, int target) {
        // int index = nums.length / 2;
        int left = 0;
        int right = nums.length - 1;
        // if it exists, return index
        // will run log2n times
        while (left <= right) {
            int mid = left + ((right - left)/2);
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        // otherwise return -1
        return -1;
    }
}
