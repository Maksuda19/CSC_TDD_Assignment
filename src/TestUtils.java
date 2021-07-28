import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author Maksuda
 *	TestUtils: Class that holds the testing of functions that define the number type
 */
public class TestUtils {
	
	/*-------------------------Testing isEven Function----------------*/
	
	/**
	 * to test isEven function for input 0
	 */
	@Test
	public void testEven_0() {
		//which is expected to be true since 0 is even
		assertEquals(UtilsNumbers.isEven(0), true);
	}

	/**
	 * to test isEven function for input 1
	 */
	@Test
	public void testEven_1() {
		//which is expected to be false since 1 is not even
		assertEquals(UtilsNumbers.isEven(1), false);
	}
	
	/**
	 * to test isEven function for input 2
	 */
	@Test
	public void testEven_2(){
		//which is expected to be true since 2 is even
		assertEquals(UtilsNumbers.isEven(2), true);
	}

	/**
	 * to test isEven function for input 3
	 */
	@Test
	public void testEven_3(){
		//which is expected to be false since 3 is not even
		assertEquals(UtilsNumbers.isEven(3), false);
	}
	
	/**
	 * to test isEven function for input 100
	 */
	@Test
	public void testEven_100(){
		//which is expected to be true since 100 is even
		assertEquals(UtilsNumbers.isEven(100), true);
	}
	
	
	/*-------------------------Testing isOdd Function----------------*/
	
	/**
	 * to test isOdd function for input 0
	 */
	@Test
	public void testOdd_0() {
		//which is expected to be false since 0 is not odd
		assertEquals(UtilsNumbers.isOdd(0), false);
	}
	
	/**
	 * to test isOdd function for input 1
	 */
	@Test
	public void testOdd_1() {
		//which is expected to be true since 1 is odd
		assertEquals(UtilsNumbers.isOdd(1), true);
	}
	
	/**
	 * to test isOdd function for input 2
	 */
	@Test
	public void testOdd_2(){
		//which is expected to be false since 2 is not odd
		assertEquals(UtilsNumbers.isOdd(2), false);
	}

	/**
	 * to test isOdd function for input 3
	 */
	@Test
	public void testOdd_3(){
		//which is expected to be true since 3 is odd
		assertEquals(UtilsNumbers.isOdd(3), true);
	}

	/**
	 * to test isOdd function for input 100
	 */
	@Test
	public void testOdd_100(){
		//which is expected to be false since 100 is not odd
		assertEquals(UtilsNumbers.isOdd(100), false);
	}

		
	/*-------------------------Testing isPrime Function----------------*/

	/**
	 * to test isPrime function for input 0
	 */
	@Test
	public void testPrime_0() {
		//which is expected to be false since 0 is not prime
		assertEquals(UtilsNumbers.isPrime(0), false);
	}
	
	/**
	 * to test isPrime function for input 1
	 */
	@Test
	public void testPrime_1() {
		//which is expected to be false since 1 is not prime
		assertEquals(UtilsNumbers.isPrime(1), false);
	}
	
	/**
	 * to test isPrime function for input 2
	 */
	@Test
	public void testPrime_2(){
		//which is expected to be true since 2 is prime
		assertEquals(UtilsNumbers.isPrime(2), true);
	}
	
	/**
	 * to test isPrime function for input 3
	 */
	@Test
	public void testPrime_3(){
		//which is expected to be true since 3 is prime
		assertEquals(UtilsNumbers.isPrime(3), true);
	}
	
	/**
	 * to test isPrime function for input 100
	 */
	@Test
	public void testPrime_100(){
		//which is expected to be false since 100 is not prime
		assertEquals(UtilsNumbers.isPrime(100), false);
	}
	

	/*-------------------------Testing getNumberType Function----------------*/
	
	/**
	 * to test getNumberType function for input 0
	 */
	@Test
	public void testNumberType_0() {
		//which is expected to be EVEN since 0 is even and not prime
		assertEquals(UtilsNumbers.getNumberType(0), "EVEN");
	}
	
	/**
	 * to test getNumberType function for input 1
	 */
	@Test
	public void testNumberType_1() {
		//which is expected to be ODD since 1 is odd and not prime
		assertEquals(UtilsNumbers.getNumberType(1), "ODD");
	}
	
	/**
	 * to test getNumberType function for input 2
	 */
	@Test
	public void testNumberType_2(){
		//which is expected to be EVENPRIME since 2 is even and prime
		assertEquals(UtilsNumbers.getNumberType(2), "EVENPRIME");
	}
	
	/**
	 * to test getNumberType function for input 3
	 */
	@Test
	public void testNumberType_3(){
		//which is expected to be ODDPRIME since 3 is odd and prime
		assertEquals(UtilsNumbers.getNumberType(3), "ODDPRIME");
	}
	
	/**
	 * to test getNumberType function for input 100
	 */
	@Test
	public void testNumberType_100(){
		//which is expected to be EVEN since 100 is even and not prime
		assertEquals(UtilsNumbers.getNumberType(100), "EVEN");
	}
}
