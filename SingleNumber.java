class Solution {
    public int singleNumber(int[] nums) {
        int n = 0;
        int j = 0;
        for(int i = 0; i<nums.length;i++){
            n = nums[i];
            while( j<nums.length){
                if(n == nums[j] && j!=i){
                    j = nums.length;
                }
                if(j == nums.length-1){
                    j = -1;
                    break;
                }
                else{
                    j++;
                }
            }
            if(j == -1){
                break;
            }
            j=0;
        }
        return n;
    }
    
}
