class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        List<List<String>> result = new ArrayList<>();
        for(String key: map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
}
