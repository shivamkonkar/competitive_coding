class Solution {
    public void moveZeroes(int[] nums) {
        int left= 0 , right = 0;
        int lengthOfArray = nums.length;
        while(right < lengthOfArray){
            if(nums[right] == 0){
                right++;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp ;
                right++;
                left++;
            }
        }
        
    }
}