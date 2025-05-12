package java_Task2_Programs;

import java.util.Scanner;

public class Task2_Reverse_a_String {

	public static void main(String[] args) 
	{
		System.out.println("Enter string");
		Scanner sc = new Scanner(System.in);
		String Str1= sc.nextLine();
		String Str2="";
		
		for(int i=Str1.length()-1; i>=0; i-- )
		{
			Str2= Str2 + Str1.charAt(i);
		}
		System.out.println("Revers String is:" +" " + Str2);
	}

}
