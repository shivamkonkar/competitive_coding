class Solution{

    static int minJumps(int[] arr){

        // your code here

        int count=0,current=0,max=0;

        for(int i=0;i<arr.length;i++)

        {

            max=Math.max(max,i+arr[i]);

            if(current >=arr.length-1)

            break;

            else if(max<=i)

            return -1;

            else if(i == current)

            {

                current=max;

                count++;

            }

        }
        
        return count;

}

    
}