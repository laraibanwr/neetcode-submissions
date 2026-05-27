class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int element1 = 0, element2 = 0;
        int count1 = 0, count2 = 0;
        for(int num: nums) {
            if(num == element1) {
                count1++;
            }
            else if(num == element2) {
                count2++;
            }
            else if(count1 == 0) {
                element1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                element2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums) {
            if(num == element1) {
                count1++;
            }
            else if(num == element2) {
                count2++;
            }
        }
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if(count1 > n / 3) result.add(element1);
        if(element2 != element1 && count2 > n / 3) result.add(element2);
        return result;
    }
}