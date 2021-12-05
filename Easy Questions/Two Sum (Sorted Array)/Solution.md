class Solution {

public int[] twoSum(int[] numbers, int target) {
		int arrLength = numbers.length;
		HashMap<Integer,Integer> numbersHashMap = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < arrLength; i++ ) {
			int compliment = target - numbers[i];
			if(numbersHashMap.containsKey(compliment)) return new int[] {numbersHashMap.get(compliment)+1,i+1};
			numbersHashMap.put(numbers[i], i);
		}

		
		
		return new int[] {};
		
	}
}