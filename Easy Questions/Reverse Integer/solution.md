class Solution {
    public int reverse(int x) {
        long reverselong = 0;
        int pop = 0;

        while(x != 0){
            pop = x % 10;
            x = x /10;
            reverselong = (reverselong * 10)+ pop;
            
            if(reverselong >Integer.MAX_VALUE || reverselong < Integer.MIN_VALUE){
                return 0;
            }
        }




        return (int)reverselong;

    }
}