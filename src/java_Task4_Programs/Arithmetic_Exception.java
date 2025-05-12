package java_Task4_Programs;

import java.util.Scanner;

public class Arithmetic_Exception {

	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d;
		
		try
		{
			d = a/b;   // throws arithmetic exception when number divisible by 0 is invalid
			System.out.println("The division value is "+ d);
		} catch (ArithmeticException e)
		{
			System.out.println("Number divisible by 0 is not valid");  
		}
        finally
        {
        	System.out.println("End of the program");
        }
	}

}
