class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            char sc = s.charAt(i);
            char tc = t.charAt(i);
            freq[sc - 'a']++;
            freq[tc - 'a']--;
        }
        for(int val: freq) {
            if(val != 0) return false;
        }
        return true;
    }
}
