class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums) {
            set.add(num);
        }
        int result = 0;
        for(Integer num: set) {
            if(!set.contains(num - 1)) {
                int count = 1;
                while(set.contains(num + 1)) {
                    count++;
                    num++;
                }
                result = Math.max(count, result);
            }
        }
        return result;
    }
}
