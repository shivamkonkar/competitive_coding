class Solution {
   
	
	 public int missingNumber(int[] nums) {
		int n = nums.length;
		int sumOfAllInteger = (n * (n+1))/2;
		int total = 0;
		for(int num:nums)total=total+num;
		return sumOfAllInteger- total;
		
}
    
}