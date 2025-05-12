package java_Task4_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_To_Array 
{

	public static void main(String[] args) 
	
	{
		System.out.println("Program to convert List to Array");
		
		System.out.println();
		List <String> lst = new ArrayList<>();
		lst.add("BMW");
		lst.add("Ford");
		lst.add("Audi");
		lst.add("Benz");
		lst.add("Toyota");
		lst.add("Ferrari");
		
		Object[] arr = lst.toArray();
		System.out.println("Array values are");
		System.out.println(Arrays.toString(arr));
		
	}

}
