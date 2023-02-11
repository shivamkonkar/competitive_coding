class Solution{
    static int minJumps(int[] arr){
      int left = 0 ;
        int N = arr.length;
        int range = arr[left];
        int counter = 0;
        int max = 0;


        while(arr[max]+max < N-1){
            
            if(arr[max] == 0){
                return -1;
            }
            
            
            for(int i = left+1 ; i <= range ; i++){
                if(max+arr[max]<= i+ arr[i]) {
                    max = i;
                }
            }
            counter++;
            left = max;
            range = left+arr[left];

        }
        return counter+1;
    }
}