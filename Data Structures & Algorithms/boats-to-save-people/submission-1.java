class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        Arrays.sort(people);
        int n = people.length;
        int i = 0, j = n - 1;
        while(i <= j) {
            if(people[i] + people[j] <= limit) {
                i++;
            }
            boats++;
            j--;
        }
        return boats;
    }
}