class Sol
{
    	   int closing (String s, int pos)
	    {
		   
		   if(s.charAt(pos) != '[') {
			   return 0 ;
		   }
		   
		   
		   Stack<Character> strStack = new Stack<Character>();
		   int strLength = s.length();
		   for(int i = pos ; i < strLength ; i++) {
			   
			   if(s.charAt(i) == '[') {
				   strStack.push(s.charAt(i));
			   }
			   
			   if(s.charAt(i) == ']') {
				   strStack.pop();
			   }
			   
			   if(strStack.empty()) {
				   return i ;
			   }
			   
		   }
		   
			return 0;
	        
	    }
}