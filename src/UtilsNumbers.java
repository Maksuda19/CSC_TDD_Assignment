
/**
 * 
 * @author Maksuda
 * UtilsNumbers: Class that hold all logic functions that detects number type
 *
 */
public class UtilsNumbers {
	
	/**
	 * isOdd: Checks if number is Odd
	 * 
	 * @param i: input integer number to be checked
	 * @return true if number is Odd
	 */
	public static boolean isOdd(int i) {
		if(i%2 != 0)
			return true;
		else
			return false;
	}

	/**
	 * isEven: Checks if number is Even
	 * 
	 * @param i: input integer number to be checked
	 * @return true if number is Even
	 */
	public static boolean isEven(int i) {
		if(i%2 == 0)
			return true;
		else
			return false;
	}
	
	/**
	 * isPrime: Checks if number is Prime
	 * 
	 * @param i: input integer number to be checked
	 * @return true if number is prime
	 */
	public static boolean isPrime(int i) {
		
		//corner case for 0 and 1
        if (i <= 1)
            return false;
  
        // Check from 2 to i-1 whether it's divisible or not
        for (int j = 2; j < i; j++)
            if (i % j == 0)
                return false;
        
        //it's prime if it's not divisible by any of previous numbers
        return true;
	}	
	
	/**
	 * getNumberType: Integration of the three functions to get the final type of the number
	 * 
	 * @param i: input integer number to be checked
	 * @return EVEN if number is even, ODD if number is Odd,
	 * 		   EVENPRIME if number is even and prime, ODDPRIME if number is odd and prime
	 * 
	 */
	public static String getNumberType(int i) {
		String ans = "";
		
		if(isEven(i))
			ans += "EVEN";
		else if(isOdd(i))
			ans += "ODD";
		
		if(isPrime(i))
			ans += "PRIME";
		
		return ans;
	}
}
