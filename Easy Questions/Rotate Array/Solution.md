class Solution {
    
    
      public static int[] rotate(int[] nums, int k) {
          k = k % nums.length;  
          reverse(nums , 0 , nums.length - 1);
          reverse(nums , 0 , k -1);
          reverse(nums , k , nums.length - 1);
          
          return nums;
    }
    
    public static void reverse(int[] nums , int start , int end){
        while ( start < end ){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
}


//Reverse the whole Array 
// Step 2 reverse 0 to k-1
//step 3 reverse k to length - 1

// [1 ,3, 4 , 5 , 6] k = 3
// [6 , 5, 4 , 3, 1 ]
// [5 , 6, 4 , 3 , 1]
// [5 ,6 , 1 ,3 , 1]