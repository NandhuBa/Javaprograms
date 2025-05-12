package java_Task4_Programs;

import java.util.Scanner;

public class ArrayIndexOutOfBound {

	public static void main(String[] args) 
	{
		System.out.println("Start of the Program");
		int[] a= {30,60,90,120,150};
		System.out.println("Enter the index value");
        Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();  //for index
		
		try
		{
			System.out.println(a[i]);
		}
	catch (ArrayIndexOutOfBoundsException e)
		{
		System.out.println("Sorry you entered a wrong index");	
		}
	finally
	{
		System.out.println("End of the program");
	}

	}

}
