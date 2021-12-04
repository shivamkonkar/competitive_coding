class Solution {
    public boolean containsDuplicate(int[] nums) {
    	
    	HashSet<Integer> numbers = new HashSet<>();
    	int arrayLength = nums.length;
    	for(int i = 0 ; i < arrayLength ; i++) {
    		if(numbers.contains(nums[i]))return true;
    		numbers.add(nums[i]);
    	}
    	
		return false;  
    }
}