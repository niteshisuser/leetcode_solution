class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=0;
       // int m2=m;
        int i=m+n-1;
        
       
         for(int j=n-1; j>=0 ;j--){
                
                if(m!=0&&nums1[m-1]>nums2[j]){
                    
                    nums1[i]=nums1[m-1];
                    
                    if(m>0)
                    m--;
                    
                    if(i>0)
                    i=i-1;
                    
                    j++;
                    
                }
                
                else{
                    
                  nums1[i]=nums2[j];
                   
                    if(i>0)
                    i=i-1;
                }
               
                  
            }
    }
}