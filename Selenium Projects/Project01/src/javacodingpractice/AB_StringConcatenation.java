package javacodingpractice;

// watch video: https://youtu.be/81goXaXnopE

public class AB_StringConcatenation {

	public static void main(String[] args) 
	{
		// + symbol is called concatenation operator 
		int a = 100;
		int b = 200;
		String x = "Hello";
		String y = "World";
		System.out.println("the value of a is: " + a); // the value of a is: 100
		System.out.println("the value of a is: " + b); // the value of a is: 200
		System.out.println("the value of a is: " + a + b); //the value of a is: 100200
		System.out.println("the value of a is: " + (a + b)); // the value of a is: 300
	}

}
