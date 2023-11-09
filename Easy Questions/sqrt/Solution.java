class Solution {
    public static int mySqrt(int x) {
        int result = 0;
        int left = 0;
        int right = x;
        while (left <= right){
            int middle = left + ((right-left)/2);
            if (Math.pow(middle,2) > x){
                right = middle-1;
            } else if (Math.pow(middle,2) < x) {
                left = middle +1;
                result = middle;
            }
            else{
                return middle;
            }
        }
        return result;
    }
}
