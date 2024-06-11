class Solution {
    public long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        int n = skill.length;
        int init = skill[0]+skill[n-1];
        long sum = skill[0]*skill[n-1];
        for(int i=1;i<n/2;i++){
            if(skill[i]+skill[n-i-1]==init)
                sum += skill[i]*skill[n-i-1];
            else 
                return -1;
        }
        return sum;
    }
}