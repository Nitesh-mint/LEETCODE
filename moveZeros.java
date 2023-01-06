class Solution {
    public void moveZeroes(int[] nums) {
        int no_of_zeros = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i]==0){
                no_of_zeros++;
            }
            else if(no_of_zeros > 0){
                int swap = nums[i];
                nums[i] = 0;
                nums[i-no_of_zeros] = swap;
            }
        }
    }
}
