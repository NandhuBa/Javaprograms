package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Palindrome {

	public static void main(String[] args) 
	{
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String Str1= sc.nextLine();
		String Str2="";
		
		//converting string to lower case for comparision
		String s = Str1.toLowerCase();
		
		//Reversing a String
		for (int i=Str1.length()-1; i>=0; i--)
		{
			Str2 = Str2 + Str1.charAt(i);
		}
		
		if(Str1.equalsIgnoreCase(Str2))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its is not a palindrome");
		}
		sc.close();
	}

}
