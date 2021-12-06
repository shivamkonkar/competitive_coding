class Solution{
        static String removeChars(String string1, String string2){
            
            HashSet<Character> strChar = new HashSet<Character>();
            int str2Length = string2.length();
            int str1Length = string1.length();
            String result = "";
            for(int i = 0 ; i < str2Length ; i++) {
            	strChar.add(string2.charAt(i));
            }
            for(int i = 0 ; i < str1Length ; i++ ) {
            	if(strChar.contains(string1.charAt(i)));
            	else {
            		result = result + string1.charAt(i);
            	}
            }
            
            return result;
        }
}