package day13_Programs;

import java.util.Scanner;

public class ValidAge {
	
	public void ValidateAge() throws InvalidAgeException
	{
		System.out.println("Enter the age of the person");
	
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if (age > 18)
		{
			System.out.println("Person is Eligible");
		}
		else
		{
			throw new InvalidAgeException();
		}
		
	}
	
	

	public static void main(String[] args) 
	{
		ValidAge obj = new ValidAge();
		
		try
		{
			obj.ValidateAge();
		}

		catch(InvalidAgeException e)
		{
			e.printStackTrace();
			System.out.println("Invalid Age entered");
		}
		
		finally
		{
			System.out.println("End of the Program");
		}
	}

}
