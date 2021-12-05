class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arrLength = numbers.length;
		HashMap<Integer,Integer> numbersHashMap = new HashMap<Integer,Integer>();
		for(int i = 0 ; i < arrLength; i++ ) {
			int compliment = target - numbers[i];
			if(numbersHashMap.containsKey(compliment)) return new int[] {numbersHashMap.get(compliment),i};
			numbersHashMap.put(numbers[i], i);
		}
        throw new IllegalArgumentException("no match found");
    }
}