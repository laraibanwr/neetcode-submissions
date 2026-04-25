class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }
        for(Integer key: map.keySet()) {
            bucket[map.get(key)].add(key);
        }
        int[] result = new int[k];
        int i = 0;
        int n = bucket.length;
        for(int j = n - 1; j >= 0; j--) {
            if(bucket[j].size() != 0) {
                for(int val: bucket[j]) {
                    result[i] = val;
                    i++;
                    if(i == k) return result;
                }
            }
        }
        return result;
    }
}
