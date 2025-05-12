

package codekatta_Day1;

import java.util.Scanner;

public class Basic_Programs {

	public static void main(String[] args) 
	{
		 System.out.println("Enter the string");
		 Scanner obj = new Scanner(System.in);
	        String s = obj.nextLine();
	        
	        
	      for(int i=0; i<s.length();i++ )
	        {
	        	char c = s.charAt(i);
	        	if(i == s.length()-1)
	        	{
	        		System.out.print(c);
	        	}
	        	else
	        	{
	        	System.out.print(c + ",");
	        	}
	       }
	        
	       
	
	}

}
