package Recursion;

import java.util.Scanner;

public class RecursionString {

	static Scanner myscan = new Scanner(System.in);
	
	
	public static char[] getChar(){
		
		String word = "deliver , knits , star -";
		char [] letterArray = word.toCharArray();
		System.out.print(letterArray);
		
		for (int k = word.length()-1; k>=0; k--){
			System.out.print(letterArray[k]);
		
			
		}
		return letterArray;
	}
		
			
	}

