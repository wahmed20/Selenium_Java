package javacodingpractice;

// watch video: https://youtu.be/LBgQBb5pxXs

public class AE_ArrayConcept {

	public static void main(String[] args) 
	{
// int Array: to store similar data type values in the array variable
// One Dimentional (Dim) array 
// lowest bound = 0
// upper bound/index = n-1 (n is the size of array)
// Dis-advantages
// 1. size is fixed. static array. To overcome this problem, we use collections. Array list, Hashtable
// 2. stores only similar data types. To overcome this problem, we use Object array
		
		System.out.println("***** 1. int Array ***** ");
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[2]);
		System.out.println(i[3]);
		//System.out.println(i[4]); // ArrayIndexOutOfBoundsException
		
		System.out.println("***** Find the size of an array *****"); 
		System.out.println(i.length);
		
		System.out.println("***** print all the values of array: use for loop ***** ");
		for (int j = 0; j < i.length; j++)
		{
			System.out.println(i[j]);
		}
		
		System.out.println("***** 2. double Array ***** ");
		double d[] = new double[3];
		d[0] = 12.33;
		d[1] = 13.44;
		d[2] = 45.55;
		System.out.println(d[2]);
		
		System.out.println("***** 3. char Array ***** ");
		char c[] = new char[3];
		c[0] = 'a';
		c[1] = '2';
		c[2] = '$';
		System.out.println(c[2]);
		
		System.out.println("***** 4. boolean Array ***** ");
		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		System.out.println(b[0]);
		
		System.out.println("***** 5. String Array ***** ");
		String s[] = new String[3];
		s[0] = "test";
		s[1] = "Hello";
		s[2] = "world";
		System.out.println(s[1]);
		
		System.out.println("***** 6. Object Array ***** ");
		// Object is a class. it is used to store different data types in array 
		Object ob[] = new Object[6];
		ob[0] = "Tom";
		ob[1] = 25;
		ob[2] = 12.33;
		ob[3] = "1/1/1990";
		ob[4] = 'M';
		ob[5] = "London";
		System.out.println(ob[5]);
	}

}
