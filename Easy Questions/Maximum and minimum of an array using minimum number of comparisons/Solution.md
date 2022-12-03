package leetcode;


public class TwoSum {


    public static void main(String[] args) {

        int arr[]= { 7};
        int length = arr.length;
        if( length == 0){
            System.out.println("Empty Array");
            System.exit(0);
        }
        if( length == 1){
            System.out.println(arr[0]);
            System.out.println(arr[0]);
            System.exit(0);
        }
        int min = arr[0];
        int max = arr[0];
        int i = 1;
        while( i < length ){
            if(arr[i] < min){
                min = arr[i];

            }
            else if ( arr[i] > max) {
                max = arr[i];

            }
           i++;
        }
        System.out.println(min);
        System.out.println(max);

    }
}
