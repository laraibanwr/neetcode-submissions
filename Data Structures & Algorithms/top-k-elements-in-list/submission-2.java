class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;

        for (int i = nums.length; i >= 0 && index < k; i--) {
            for (int num : buckets.get(i)) {
                result[index++] = num;
                if (index == k) break;
            }
        }

        return result;
    }
}
