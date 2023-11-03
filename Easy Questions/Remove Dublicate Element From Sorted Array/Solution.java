class Solution {
    public int removeDuplicates(int[] nums) {

        int index = 0;
        int currentElement = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > currentElement){
                nums[index] = nums[i];
                currentElement = nums[i];
                index++;
            }
        }

        return index;
        
    }
}
