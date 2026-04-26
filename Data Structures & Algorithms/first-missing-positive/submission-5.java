class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= n; i++) {
            set.add(i);
        }
        for(int num: nums) {
            if(num > 0) {
                set.remove(num);
            }
        }
        if(set.size() == 0) return n + 1;
        int min = Integer.MAX_VALUE;
        for(Integer val: set) {
            if(val < min) min = val;
        }
        return min;
    }
}