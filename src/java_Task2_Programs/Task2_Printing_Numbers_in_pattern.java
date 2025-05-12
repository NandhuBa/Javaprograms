package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Printing_Numbers_in_pattern 
{

	public static void main(String[] args) 
	{
		System.out.println("The Input sample is:");
	    Scanner sa = new Scanner(System.in);
	    int n = sa.nextInt();
		System.out.println("The output pattern is:");
		int count = 1;  
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=i; j++)
			{
				if (count <= 10)
				{
					System.out.print(count + " ");
					count++;
				}
			}
			System.out.println();
		}
	}

}
