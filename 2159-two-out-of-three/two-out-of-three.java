class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums1)
            set.add(num);
        
        List<Integer> result = new ArrayList<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums2){
            if(set.contains(num) && !set2.contains(num))
                result.add(num);
         
            set2.add(num);
        }
        
        for(int num : nums3)
            if(!result.contains(num) && (set.contains(num) || set2.contains(num)))
                result.add(num);
        
        return result;
    }
}