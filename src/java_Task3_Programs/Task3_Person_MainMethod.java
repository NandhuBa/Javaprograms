package java_Task3_Programs;

public class Task3_Person_MainMethod {

	public static void main(String[] args) 
	{
		Task3_Person obj = new Task3_Person();
	    obj.Task3_Person("Nandhu", 28);
		System.out.println("Name of the person is"+ " " + obj.getname());
		System.out.println("Age of the person is"+ " " + obj.getage());
		
	}

}
