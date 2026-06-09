class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        int n = people.length;
        Arrays.sort(people);
        int i = 0, j = n - 1;
        while(i <= j) {
            int totalWeight = people[i] + people[j];
            if(totalWeight <= limit) {
                i++;
            }
            boats++;
            j--;
        }
        return boats;
    }
}