class Solution {

public int[] twoSum(int[] numbers, int target) {

    int left = 0;
    int right = numbers.length - 1;
    while(right>=left){
        int sum = numbers[right] + numbers[left];
        if(sum < target) left += 1;
        else if(target< sum) right-= 1;
        else return new int[]{left+1,right+1};
    }
		return new int[] {};
	}
}