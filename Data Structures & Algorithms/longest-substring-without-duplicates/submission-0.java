class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int i = 0, j = 0;
        while(j < n) {
            while(set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }
            maxLength = Math.max(maxLength, j - i + 1);
            set.add(s.charAt(j));
            j++;
        }
        return maxLength;
    }
}
