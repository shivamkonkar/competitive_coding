class Solution {
    
        String removeDups(String S) {
    	
    	HashSet<Character> strSet = new HashSet<Character>();
    	String result ="";
    	int strLength = S.length();
    	for(int i = 0 ; i < strLength ; i++) {
    		if(strSet.contains(S.charAt(i)));
    		else {
    			strSet.add(S.charAt(i));
    			result = result + S.charAt(i);
    		}
    	}
		return result;
        
    }
    
}