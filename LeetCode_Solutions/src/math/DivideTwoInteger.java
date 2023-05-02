package math;

public class DivideTwoInteger {
  	public static int divide(int dividend, int divisor) {
        Long divide1 =  (long) dividend;
        Long divisor1 =  (long) divisor;
 		Long result =  (divide1 / divisor1);
 		
 if((result > Integer.MAX_VALUE)) {
 	result = result - 1;
 	
 }else if (result < Integer.MIN_VALUE) {
 	result = result + 1;
 }
            
 		return Long.valueOf(result).intValue();
 	}
}
