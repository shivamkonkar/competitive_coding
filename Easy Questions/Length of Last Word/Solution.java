class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        int index = s.length();

        if (s.isEmpty()) {
            return count;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }
}
