//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int lastElement = arr[n-1];
        
        for(int i = n-2 ; i >= 0 ; i--){
            arr[i+1] = arr[i];
        }
        
        arr[0] = lastElement;
    }
}