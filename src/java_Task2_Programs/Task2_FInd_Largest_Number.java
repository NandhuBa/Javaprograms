package java_Task2_Programs;

import java.util.Scanner;

public class Task2_FInd_Largest_Number {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter three numbers");
		Scanner sa=new Scanner(System.in);
		int num1 = sa.nextInt();
		
		Scanner sb = new Scanner(System.in);
		int num2 = sb.nextInt();
		
		Scanner sc=new Scanner(System.in);
		int num3 = sc.nextInt();
		
		if ((num1>num2) && (num1>num3))
		{
		System.out.println(num1 + " " + "is the largest number");	
		}
		else if ((num2>num1) && (num2>num3))
		{
			System.out.println(num2 + " " + "is the largest number");
		}
		else
		{
			System.out.println(num3 + " " + "is the largest number");
		}
		 sa.close();
         sb.close();
         sc.close();
	}	
        
	}
