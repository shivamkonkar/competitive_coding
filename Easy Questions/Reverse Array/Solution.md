package leetcode;


public class TwoSum {

    static void swap(int a, int b , int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
    public static void main(String[] args) {

        int arr[]={3 , 5, 7, 9, 10};
        int right  = arr.length-1;
        int length = right;
        int left = 0;
        while( left < right){
            swap(left , right, arr);
            left++;
            right--;
        }

        for(int j = 0 ; j <= length ; j++){
            System.out.println(arr[j]);
        }

    }



}
