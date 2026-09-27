class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int maxHeight = 0;
        for(int i = 0; i < n; i++) {
            maxHeight = Math.max(maxHeight, height[i]);
            leftMax[i] = maxHeight;
        }
        maxHeight = 0;
        for(int i = n - 1; i >= 0; i--) {
            maxHeight = Math.max(maxHeight, height[i]);
            rightMax[i] = maxHeight;
        }
        int water = 0;
        for(int i = 0; i < n; i++) {
            water += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return water;
    }
}
