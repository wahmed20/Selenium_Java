package javacodingpractice;

public class AC_ifStatementComparison {

	public static void main(String[] args) 
	{
		// comparison operators
		// < > <= >= == != &
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		if (b1 > a1) // b1 is greater than a1
		{
			System.out.println("b1 is greater than a1");
		}
		else 
		{
			System.out.println("a1 is greater than b1");
		}
		
		if (b1 < a1) // a1 is less than b1
		{
			System.out.println("b1 is less than a1");
		}
		else 
		{
			System.out.println("a1 is less than b1");
		}
		if (b1 <= a1) // b1 is less than a1
		{
			System.out.println("b1 is less than a1");
		}
		else 
		{
			System.out.println("a1 is less than b1");
		}
		if (b1 >= a1) // b1 is greater than a1
		{
			System.out.println("b1 is greater than a1");
		}
		else 
		{
			System.out.println("a1 is greater than b1");
		}
		if (b1 == c1) // b1 is not equal to c1
		{
			System.out.println("b1 is equal to c1");
		}
		else 
		{
			System.out.println("b1 is not equal to c1");
		}
		if (a1 != b1) // a1 is not equal to b1
		{
			System.out.println("a1 is not equal to b1");
		}
		else 
		{
			System.out.println("a1 is equal to b1");
		}
		
		// Nested if-else
		
		if (a1 > b1 & a1 > c1) // false & false = false
		{
			System.out.println("a1 is the greatest");
		}
		else if (b1 > c1) // false & true = false
		{
			System.out.println("b1 is the greatest");
		}
		else // true
		{
			System.out.println("c1 is the greatest");
		}
	}

}
