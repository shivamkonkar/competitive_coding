package leetcode;


public class TwoSum {


    public static void main(String[] args) {

        int arr[] = { 4,-44,2 , -1,6 , -55 };
        int low = 0 ;
        int high = arr.length -1;
        int temp;
        while(low <= high){
            temp = arr[high];
            arr[high]= arr[low];
            arr[low] = temp;
            if(arr[low]< 0){
                low++;
            }
            if(arr[high] >= 0){
                high--;
            }


        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

    }
}
