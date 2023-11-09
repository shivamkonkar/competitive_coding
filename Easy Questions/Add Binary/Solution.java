class Solution {
    public String addBinary(String a, String b) {
             String result = "";
        int pow = 0;
        int alength = a.length() -1 ;
        int blength = b.length() -1;
        while(alength >= 0 && blength >= 0 ){
            if(a.charAt(alength)=='0'&&b.charAt(blength)=='0'&&pow==0){
                result = "0"+result;
            }
            else if((a.charAt(alength)=='0'&&b.charAt(blength)=='0'&&pow==1)||(a.charAt(alength)=='0'&&b.charAt(blength)=='1'&&pow==0)||(a.charAt(alength)=='1'&&b.charAt(blength)=='0'&&pow==0)){
                result = "1"+result;
                pow = 0;
            }
            else if((a.charAt(alength)=='1'&&b.charAt(blength)=='1'&&pow==0)||(a.charAt(alength)=='1'&&b.charAt(blength)=='0'&&pow==1)||(a.charAt(alength)=='0'&&b.charAt(blength)=='1'&&pow==1)){
                result = "0"+result;
                pow = 1;
            }
            else{
                result = "1"+result;
                pow = 1;
            }
            alength--;
            blength--;
        }

        while(alength >= 0){
            if(a.charAt(alength)=='1' && pow == 1){
                result = "0"+result;
                pow = 1;
            }
            else if (a.charAt(alength)=='0' && pow ==0) {
                result = "0"+result;
                pow = 0;
            }
            else {
                result = "1"+result;
                pow = 0;
            }
            alength--;
        }

        while(blength >= 0){
            if(b.charAt(blength)=='1' && pow == 1){
                result = "0"+result;
                pow = 1;
            }
            else if (b.charAt(blength)=='0' && pow ==0) {
                result = "0"+result;
                pow = 0;
            }
            else {
                result = "1"+result;
                pow = 0;
            }
            blength--;
        }

        if(pow == 1){
            result = "1"+result;
        }
        return result;
    }
}
