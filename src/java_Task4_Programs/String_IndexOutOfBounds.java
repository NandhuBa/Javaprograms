package java_Task4_Programs;

import java.util.Scanner;

public class String_IndexOutOfBounds {

	public static void main(String[] args) 
	{
		System.out.println("Start of the Program");
		System.out.println("Enter the String");
		Scanner sc= new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the Index value");
		int i = sc.nextInt(); 
		
		try
		{
			System.out.println(str.charAt(i));
		}
		catch (StringIndexOutOfBoundsException e)
		{
		System.out.println("Sorry!! there is no character with the index in this string");
		}
		finally
		{
			System.out.println("End of the program");
		}

	}

}
