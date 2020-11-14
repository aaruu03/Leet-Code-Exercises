class Solution {
    public int[] twoSum(int[] nums, int target) {
      
      int m; 
        int l=0;
     int[] n=new int[2];  
      int k = nums.length;
      for (int i=0;i<k;i++) {
          
        for (int j=i+1;j<k;j++) {
          m=nums[i]+nums[j];
          if (m==target) {
                            
             if ((l==0) || (l>i+j)) {
                l=i+j;
                n[0]= (i);
                n[1]=(j);
               } 
            }
       }
          
      }     
        
    return n;   
    }
}
