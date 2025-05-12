package java_Task3_Programs;

public class Task3_Employee_MainMethod {

	public static void main(String[] args) 
	
	{
		Task3_Employee obj = new Task3_Employee();
		obj.setEmp(001, "Aarthi", "Ravi", 10000);
		System.out.println("Employee ID :" + " " + obj.getID());
		System.out.println("Employee Firstname :" + " " + obj.getFirstname());
		System.out.println("Employee Lastname :" + " " + obj.getLastname());
		System.out.println("Employee salary  :" + " " + obj.getSalary());
		System.out.println("Full Name of the employee :" + " " + obj.getName());
		//obj.getName();
		obj.setSalary(20000);
		obj.getSalary1();
		System.out.println("Annal Salary of an Employee :" + " " + obj.getAnnualSalary());
		//obj.raise_Salary(30);
		System.out.println("The revised salary :" + " " + obj.raise_Salary(30));
		System.out.println();
        System.out.println(obj.tostring());
       
	}

}
