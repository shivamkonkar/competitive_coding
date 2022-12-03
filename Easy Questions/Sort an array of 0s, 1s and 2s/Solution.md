class Solution
{
    public static void sort012(int a[], int n)
    {
        int left = 0;
        int mid = 0;
        int right = n-1;
        while(mid <= right){
            if(a[mid]== 0){
                a[mid] = a[left];
                a[left] = 0;
                left++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else{
                a[mid] = a[right];
                a[right]= 2;
                right--;
            }
        }
        
        
    }

}