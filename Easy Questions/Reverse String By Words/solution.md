class Solution {
    public String reverseWords(String s) {
    	
    	if(s == null || s.length() == 0)return s;
    	
    	StringBuilder result = new StringBuilder();
    	String[] strsplit = s.split(" ");
    	
    	for(String word: strsplit) {
    		StringBuilder strbuild = new StringBuilder();
    		strbuild.append(word);
    		strbuild.reverse();
    		
    		result.append(strbuild.toString()+" ");
    		
    	}
    	result.setLength(result.length() - 1);

    	
     return result.toString();  
    }
}