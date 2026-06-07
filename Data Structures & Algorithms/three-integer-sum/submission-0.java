class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < n - 2; i++) {
            if(nums[i] > 0) break;
            if(i > 0 && nums[i - 1] == nums[i]) continue;
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while(j < k && nums[j + 1] == nums[j]) {
                        j++;
                    }
                    while(j < k && nums[k - 1] == nums[k]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}
