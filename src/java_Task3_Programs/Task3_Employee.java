package java_Task3_Programs;

public class Task3_Employee 

{
  private int id;
  private String firstname;
  private String lastname;
  public int salary;
  private int salary1;
  public int percent;
  public int revised_sal;
  String Name;
  
  public void setEmp(int id, String firstname, String lastname, int salary)
  {
	  this.id = id;
	  this.firstname = firstname;
	  this.lastname = lastname;
	  this.salary = salary;
  }
  
  public int getID()
  {
	  return id;
  }
  
  public String getFirstname()
  {
	  return firstname;
  }
  
  public String getLastname()
  {
	  return lastname;
  }
  
  
  public int getSalary()
  {
	  return salary;
  }
  
  public String getName()
  {
	  Name = firstname + " " + lastname;
	  return Name;
	  //System.out.println("Name of the Employee is" + " " + Name);
  }
  
  public void setSalary(int salary1)  
  {
	this.salary1 = salary1;
	
  }
  
  public void getSalary1()
  
  {
	  System.out.println("New Salary of the Employee : " + " " + salary1);
  }
  
  public int getAnnualSalary()
  {
	  int AnnualSalary = (salary1 * 12);
	 return AnnualSalary;
  }
  
 public int raise_Salary(int percent)
 {   
	 revised_sal =  (salary1 + (salary1 * percent)/100);
	 return revised_sal;
 }
 
  public String tostring()
 {
	 return "Employee[id: " + id + "; Name: " + Name + "; Salary: " + revised_sal + "]";
	 
 } 
}
