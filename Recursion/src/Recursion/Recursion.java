// pp 798-799 ch18 excercises for reference
// I placed each code sample in its own method and had each method called by the main class.
// I changed the SumSquares method to use input from a user rather than input from the code.

package Recursion;

public class Recursion {

	// multiplies by power of 2 then adds to total each time it loops
	
	public static long SumSquares(long n) {
		  long n_squared;
		  long others;

		  if(n < 1) {
		    return 0;
		    } 
		  else {
		    n_squared = n * n;
		    others = SumSquares(n - 1);
		    return n_squared + others;
		  }
		}
	
	// prints elements in an array from end to beginning
	
	public static String backwardArray(int[] array2, int x)
	{
		if (x < array2.length)
				return String.format("%s%d, ", backwardArray(array2, x + 1), array2[x]);
		else
			return "";
	}

	// adds all elements in an array
	
	public static int addingMethod(int[] arrayB, int size)
	{
		if (size == 1)
			return arrayB[0];
		else
			return arrayB[size - 1] + addingMethod(arrayB, size - 1);
	}
}
