class Solution {
    private boolean isPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0, j = n - 1;
        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s.substring(i, j)) || isPalindrome(s.substring(i + 1, j + 1));
            }
            i++;
            j--;
        }
        return true;
    }
}