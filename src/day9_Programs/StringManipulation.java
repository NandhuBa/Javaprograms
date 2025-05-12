package day9_Programs;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    Scanner a = new Scanner(System.in);  
	    Scanner b = new Scanner(System.in); // Used to get the input values from user
	    
	    System.out.print("Enter a number: ");
		int n = sc.nextInt();                  // Assigning Integer input to Integer variable using object "sc"
		System.out.print("The number is : " + n);
		
		System.out.println();
		
	    System.out.print("Enter strings : ");     // Object differs for getting each input
		String Str1 = a.next();    // (or) String Str1 = a.nextLine();     // Assigning String input to String variable using object "a"
		String Str2 = b.next();    // (or) String Str2 = b.nextLine();     // Assigning String input to String variable using object "b"	                                          
	    System.out.println ("Inputs are " + Str1 +" "+ Str2); 
           
	    
	    
	    
	    
	    
	    
	    //String Manipulation/:
	    //---------------------
	    
        System.out.println(str1.concat(str2));
		
		System.out.println(str1.charAt(1)); // Will return the character that is present in the specific index
		
		System.out.println(str1.equals(str2)); // check whether the value for both the strings are matching
		
		// This is used for comparing numbers == 
		
		// difference between == and equals()
		
		// equals() will check the value
		// == will check the address 
		
		System.out.println(str1==str2);
		
		System.out.println(str1.contains(str2)); // used to check whether str1 has the value of str2
		
		System.out.println(str1.length()); // Return the no.of values the string is having
	
		
		
	}
	
}
