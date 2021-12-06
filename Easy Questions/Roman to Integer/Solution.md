class Solution {
    public int romanToInt(String s) {
    	
    	HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
    	romanValues.put('I', 1);
    	romanValues.put('V', 5);
    	romanValues.put('X', 10);
    	romanValues.put('L', 50);
    	romanValues.put('C', 100);
    	romanValues.put('D', 500);
    	romanValues.put('M', 1000);
    	int sum = 0 ;
    	if(s == null || s.length() == 1) return sum += romanValues.get(s.charAt(0));
    	
    	
    	int arrLength = s.length() ;
    	for(int i = 0 ; i < arrLength ; i++) {
    		if(s.charAt(i)=='V' || s.charAt(i)=='X') {
    			if(i > 0 && s.charAt(i - 1) == 'I') sum -= 2;
    		}
    		if(s.charAt(i)=='L' || s.charAt(i)=='C') {
    			if(i > 0 && s.charAt(i - 1) == 'X') sum -= 20;
    		}
    		if(s.charAt(i)=='D' || s.charAt(i)=='M') {
    			if(i > 0 && s.charAt(i - 1) == 'C') sum -= 200;
    		}
    		
    		sum = sum + romanValues.get(s.charAt(i));
    		
    	}
		return sum;
        
    }
}