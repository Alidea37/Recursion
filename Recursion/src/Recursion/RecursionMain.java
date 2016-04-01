package Recursion;
// reference for user input exception:
// http://stackoverflow.com/questions/18119211/how-to-check-if-user-input-is-not-an-int-value


import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionMain {

	//static boolean continueLoop = true;
	
	public static void main(String[] args)
	{
					Scanner myscan = new Scanner(System.in);
					
			try{
				System.out.println("Enter a number: ");
				
				int numselect = myscan.nextInt(); // get a starting number from the user
					
		// create a sum of all the integers' 2nd power
	for (int counter = 0; counter <= numselect; counter++)
		System.out.printf("%d = %d%n", counter, Recursion.SumSquares(counter));
			
						myscan.close();	
		}
			catch(InputMismatchException exception)
		
			{ System.out.println("That input was incorrect. Moving on.");  // Skips the first method if input is incorrect - might change later
						//System.out.print("Enter an Integer: ");		
						//myscan.next();
						//	continueLoop = true;
					}
	
				// for backwardArray
			int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
				String results = Recursion.backwardArray(array, 0);
					System.out.println("ArrayX backward is : " + results);
	
					
				// for addingMethod
			int result = Recursion.addingMethod(array, array.length);
				System.out.printf("The sum of this array is: %d%n", result);

				
			RecursionString.getChar();
				
	}	
	
}