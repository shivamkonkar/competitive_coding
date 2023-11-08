class Solution {
     public static int strStr(String haystack, String needle) {
        int pointerHaystack = 0;
        int pointerNeedle = 0;
        int length = haystack.length();



        while (pointerHaystack < length){

            if(haystack.charAt(pointerHaystack) == needle.charAt(pointerNeedle)){
                pointerHaystack++;
                pointerNeedle++;
            }
            else{
                pointerHaystack = pointerHaystack -  pointerNeedle;
                pointerNeedle = 0;
                pointerHaystack++;
            }
            if (pointerNeedle == needle.length()){
                return pointerHaystack - pointerNeedle;
            }
        }
        return -1;
    }
}
