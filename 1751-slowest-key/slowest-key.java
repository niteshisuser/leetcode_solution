class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char sk=keysPressed.charAt(0);
        int n = releaseTimes.length;
        int maxDuration = releaseTimes[0];
        for(int i=1;i<n;i++)
            if(releaseTimes[i]-releaseTimes[i-1]>maxDuration){
                maxDuration = releaseTimes[i]-releaseTimes[i-1];
                sk = keysPressed.charAt(i);
            }
            else if(releaseTimes[i]-releaseTimes[i-1]==maxDuration){
                if(sk<keysPressed.charAt(i)){
                    sk = keysPressed.charAt(i);
                }
            }
        return sk;
    }
}