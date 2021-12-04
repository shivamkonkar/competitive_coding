class Solution {
    public int[] sortedSquares(int[] nums) {
        		int[] result = new int[nums.length];
        int left = 0 , right = nums.length - 1 , index = nums.length -1;
        while(right >= left){
        	
        	if(Math.abs(nums[left])>Math.abs(nums[right])) {
        		result[index]=nums[left]*nums[left];
        		index--;
        		left++;
        	}
        	else {
        		result[index]=nums[right]*nums[right];
        		index--;
        		right--;
        	}
        	
        }
		return result;
        }
}
