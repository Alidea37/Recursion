package Recursion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RecursionInfo {
	
	static boolean continueLoop = true;
	static Scanner myscan = new Scanner(System.in);
	
	
	public static int getNumber( int numselect){
	
		
		
	
		do // divide by zero exception handling on pp 435-436
			{
				try 
				{	
					Scanner myscan = new Scanner(System.in);

					System.out.println("Enter how many any whole number less than 50: ");
				
					int numselect = myscan.nextInt();
				
					 
					myscan.close();

								
												
			continueLoop = false; // input successful; end looping
				}
			
				catch (InputMismatchException inputMismatchException)
			
				{
					// if letters or doubles are entered
					
					System.err.printf("%nException: %s%n",
						inputMismatchException);
						myscan.nextLine(); // discard input so user can try again
						System.out.printf("You must enter a whole number. Please try again.%n%n");
				}
			
				}while (continueLoop);
			myscan.close();
			return numselect;
	}
}

	//
	//Make a working getMethod to call recursion info to recursion addingMethod
	//Make a string recursion 


