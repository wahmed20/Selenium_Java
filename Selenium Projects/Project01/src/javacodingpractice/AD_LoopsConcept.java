package javacodingpractice;

public class AD_LoopsConcept {

	public static void main(String[] args) 
	{
		System.out.println("*****while Loop*****");
		// 1. while loop
		// Disadvantage: it will generate infinite loop if we don't increment/decrement
		int i = 1; // initialization 
		while (i <= 3) // condition 
		{
			System.out.print(i + ", ");
			i = i + 1; // increment/decrement 
		}
		System.out.println();
		System.out.println("*****For Loop*****");
		
		// 2. For loop
		for (int j = 4; j >= 1; j--) // j++ means j = j +1
		{
			System.out.print(j + ", ");
		}
		
		System.out.println("*****while Loop*****");
	}

}
