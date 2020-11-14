class Solution {
    public int singleNonDuplicate(int[] nums) {
     int thisis = 0;
        if(nums.length == 1 ){
            return nums[0];
        }
        if(nums[0]!=nums[1]){
           return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        
        for(int i = 1; i<nums.length-2;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                thisis = nums[i];
                break;
            }
        }
        return thisis;
    }
}
