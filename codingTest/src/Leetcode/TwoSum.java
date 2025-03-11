class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        // Adjust the for-loop to avoid out-of-bounds access
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++ ) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("can't combine units");
    }
}
