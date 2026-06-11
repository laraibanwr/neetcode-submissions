class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i = 0, j = 0;
        Map<Character, Integer> lastSeen = new HashMap<>();
        int maxLength = 0;
        while(j < n) {
            char ch = s.charAt(j);
            if(lastSeen.containsKey(ch)) {
                i = Math.max(lastSeen.get(ch) + 1, i);
            }
            maxLength = Math.max(maxLength, j - i + 1);
            lastSeen.put(ch, j);
            j++;
        }
        return maxLength;
    }
}
