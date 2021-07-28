/**
 * 
 * @author Maksuda
 * Class Program that hold the main function
 *
 */
public class Program {
	
	/**
	 * main function that holds the required logic of the program
	 * @param args: holds the parameters entered from command line
	 */
	public static void main(String[] args) {
		
			//looping over 100 number and apply the test for each one of them
			//then prints the number itself with the type 
			for(int i = 1; i <= 100; i++) {
				System.out.println(i + ": " + UtilsNumbers.getNumberType(i));
			}
	}

}
