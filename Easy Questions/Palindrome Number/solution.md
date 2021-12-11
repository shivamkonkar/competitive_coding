class Solution {
    public boolean isPalindrome(int x) {
        
   
        int reverse = 0;
        int pop ;
        if(x == 0){
            return true;
        }
        if(x < 0 || x%10 == 0){
            return false;
        }
        while(x > reverse){
            pop = x % 10;
            x= x/10;
            reverse = (reverse * 10)+ pop;
        }
        if(reverse == x || x == reverse / 10){
            System.out.print("true");
            return true;
        }
        System.out.print("false");
        return false;


    
    }
}