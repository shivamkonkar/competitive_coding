class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maximum = 0;
        int a_pointer = 0;
        int b_pointer = 0;
        HashSet<Character> visited = new HashSet<>();
        while (b_pointer < s.length()){
            if(visited.contains(s.charAt(b_pointer))){
                visited.remove(s.charAt(a_pointer));
                a_pointer++;
            }
            else{
                visited.add(s.charAt(b_pointer));
                b_pointer++;
                maximum = Math.max(visited.size(), maximum);
            }
        }
        return maximum;
    }
}
