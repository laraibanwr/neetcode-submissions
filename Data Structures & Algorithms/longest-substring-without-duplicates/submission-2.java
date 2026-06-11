class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLength = 0;
        while(j < n) {
            if(lastSeen.containsKey(s.charAt(j))) {
                i = Math.max(lastSeen.get(s.charAt(j)) + 1, i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            lastSeen.put(s.charAt(j), j);
            j++;
        }
        return maxLength;
    }
}
