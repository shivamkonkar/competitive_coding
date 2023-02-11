class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int[] nums2 = new int[length];
        int temp = 0;

        for(int i = 0 ; i < length ; i++){
            temp = nums[i];
            if(nums2[temp] == 0){
                nums2[temp] = 1;
            }
            else{
                return temp;
            }

        }
    return -1;
    }
}