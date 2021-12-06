class Solution
{
    public int penaltyScore(String S)
    {
    	int strlength = S.length();
    	int result = 0;
    	for(int i = 0 ; i < strlength - 1 ; i++) {
    		if(S.charAt(i)=='2' && S.charAt(i+1)=='1') {
    			result = result +1;
    		}
    	}
    	
		return result;
    }
}