package java_Task4_Programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Program {

	public static void main(String[] args) 
	
	{
		ArrayList<String> Countries = new ArrayList<>();
		
		Countries.add("INDIA");
		Countries.add("USA");
		Countries.add("Australia");
		Countries.add("Russia");
		Countries.add("Canada");
		Countries.add("Japan");
		Countries.add("China");
		
		System.out.println(Countries);
		
		
		
		/*System.out.println("Removing all String elements from ArrayList");
		Countries.remove("INDIA");
		Countries.remove("USA");
		Countries.remove("Australia");
		Countries.remove("Russia");
		Countries.remove("Canada");
		Countries.remove("Japan");
		*/Countries.remove("China");
		
		System.out.println(Countries);
		
	
		}
		
		
	}


