package java_Task4_Programs;
import java.util.Map;
import java.util.TreeMap;

public class Employee {

	public static void main(String[] args) 
	{
		System.out.println("TreeMap Program");
		
		TreeMap<Integer, String> Emp = new TreeMap<>();

		Emp.put(01, "Aarthi");
		Emp.put(06, "Tarun");
		Emp.put(03, "Beryl");
		Emp.put(05, "Savitha");
		Emp.put(02, "Anu");
		Emp.put(04, "Mohan");
		
		System.out.println("Employee names in alphabetical order:");
		
		for (Map.Entry<Integer, String> entry : Emp.entrySet())
		{
	
			System.out.println(entry.getValue()); //Printing only values 
		}
	
	}

}
