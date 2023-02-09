class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        long result = arr[0];
        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max+arr[i] > arr[i]){
                max = max + arr[i];
            }
            else{
                max = arr[i];
            }
            if(result < max){
                result = max;
            }
        }
        
        return result;
    }
    
}