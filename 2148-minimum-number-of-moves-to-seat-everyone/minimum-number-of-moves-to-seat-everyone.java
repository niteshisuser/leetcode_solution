class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        /*
        1,3,5
        2,4,7
        1,1,2=4

        1,4,5,9
        1,2,3,6
        0,2,2,3=7
        */
        Arrays.sort(seats);
        Arrays.sort(students);
        int s = seats.length;
        int count = 0;
        for(int i=0;i<s;i++)
            count += (int)(Math.abs(seats[i]-students[i]));
        return count;
    }
}