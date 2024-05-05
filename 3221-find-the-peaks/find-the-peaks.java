class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> peakList = new ArrayList();
        for(int i=1;i<mountain.length-1;i++)
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1])
                peakList.add(i);
        
        return peakList;
    }
}